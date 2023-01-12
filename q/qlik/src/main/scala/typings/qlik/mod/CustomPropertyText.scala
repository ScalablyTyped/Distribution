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
  
  inline def apply(): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = "text")
    __obj.asInstanceOf[CustomPropertyText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertyText] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
