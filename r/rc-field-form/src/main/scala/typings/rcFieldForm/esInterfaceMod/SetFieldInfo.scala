package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFieldInfo extends StObject {
  
  var data: FieldData
  
  var `type`: "setField"
}
object SetFieldInfo {
  
  inline def apply(data: FieldData): SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[SetFieldInfo]
  }
  
  extension [Self <: SetFieldInfo](x: Self) {
    
    inline def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: "setField"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
