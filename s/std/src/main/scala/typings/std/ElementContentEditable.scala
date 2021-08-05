package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementContentEditable extends StObject {
  
  var contentEditable: java.lang.String
  
  var enterKeyHint: java.lang.String
  
  var inputMode: java.lang.String
  
  val isContentEditable: scala.Boolean
}
object ElementContentEditable {
  
  inline def apply(
    contentEditable: java.lang.String,
    enterKeyHint: java.lang.String,
    inputMode: java.lang.String,
    isContentEditable: scala.Boolean
  ): ElementContentEditable = {
    val __obj = js.Dynamic.literal(contentEditable = contentEditable.asInstanceOf[js.Any], enterKeyHint = enterKeyHint.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementContentEditable]
  }
  
  extension [Self <: ElementContentEditable](x: Self) {
    
    inline def setContentEditable(value: java.lang.String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyHint(value: java.lang.String): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setInputMode(value: java.lang.String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setIsContentEditable(value: scala.Boolean): Self = StObject.set(x, "isContentEditable", value.asInstanceOf[js.Any])
  }
}
