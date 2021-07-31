package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyOption extends StObject {
  
  var label: String
  
  var value: String
}
object CustomPropertyOption {
  
  @scala.inline
  def apply(label: String, value: String): CustomPropertyOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyOption]
  }
  
  @scala.inline
  implicit class CustomPropertyOptionMutableBuilder[Self <: CustomPropertyOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
