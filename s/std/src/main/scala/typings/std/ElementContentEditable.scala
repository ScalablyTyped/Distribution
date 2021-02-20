package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementContentEditable extends StObject {
  
  var contentEditable: java.lang.String = js.native
  
  var enterKeyHint: java.lang.String = js.native
  
  var inputMode: java.lang.String = js.native
  
  val isContentEditable: scala.Boolean = js.native
}
object ElementContentEditable {
  
  @scala.inline
  def apply(
    contentEditable: java.lang.String,
    enterKeyHint: java.lang.String,
    inputMode: java.lang.String,
    isContentEditable: scala.Boolean
  ): ElementContentEditable = {
    val __obj = js.Dynamic.literal(contentEditable = contentEditable.asInstanceOf[js.Any], enterKeyHint = enterKeyHint.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementContentEditable]
  }
  
  @scala.inline
  implicit class ElementContentEditableMutableBuilder[Self <: ElementContentEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentEditable(value: java.lang.String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHint(value: java.lang.String): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMode(value: java.lang.String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContentEditable(value: scala.Boolean): Self = StObject.set(x, "isContentEditable", value.asInstanceOf[js.Any])
  }
}
