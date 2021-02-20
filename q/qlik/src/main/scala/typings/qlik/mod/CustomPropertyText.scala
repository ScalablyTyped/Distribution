package typings.qlik.mod

import typings.qlik.qlikStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyText
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: text = js.native
}
object CustomPropertyText {
  
  @scala.inline
  def apply(component: text): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyText]
  }
  
  @scala.inline
  implicit class CustomPropertyTextMutableBuilder[Self <: CustomPropertyText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
