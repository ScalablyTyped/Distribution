package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphValue extends StObject {
  
  var `type`: OpenGraphValueType
  
  var value: js.Any
}
object OpenGraphValue {
  
  @scala.inline
  def apply(`type`: OpenGraphValueType, value: js.Any): OpenGraphValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphValue]
  }
  
  @scala.inline
  implicit class OpenGraphValueMutableBuilder[Self <: OpenGraphValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OpenGraphValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
