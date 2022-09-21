package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphValue extends StObject {
  
  var `type`: OpenGraphValueType
  
  var value: Any
}
object OpenGraphValue {
  
  inline def apply(`type`: OpenGraphValueType, value: Any): OpenGraphValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphValue]
  }
  
  extension [Self <: OpenGraphValue](x: Self) {
    
    inline def setType(value: OpenGraphValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
