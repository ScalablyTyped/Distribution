package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerHTML extends StObject {
  
  var innerHTML: java.lang.String = js.native
}
object InnerHTML {
  
  @scala.inline
  def apply(innerHTML: java.lang.String): InnerHTML = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHTML]
  }
  
  @scala.inline
  implicit class InnerHTMLMutableBuilder[Self <: InnerHTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerHTML(value: java.lang.String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
  }
}
