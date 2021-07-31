package typings.qlik.mod

import typings.qlik.qlikStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyText
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: text
}
object CustomPropertyText {
  
  @scala.inline
  def apply(): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = "text")
    __obj.asInstanceOf[CustomPropertyText]
  }
  
  @scala.inline
  implicit class CustomPropertyTextMutableBuilder[Self <: CustomPropertyText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
