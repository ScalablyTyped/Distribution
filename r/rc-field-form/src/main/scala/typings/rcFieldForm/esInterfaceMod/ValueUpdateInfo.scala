package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueUpdateInfo extends StObject {
  
  var source: "internal" | "external"
  
  var `type`: "valueUpdate"
}
object ValueUpdateInfo {
  
  inline def apply(source: "internal" | "external"): ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("valueUpdate")
    __obj.asInstanceOf[ValueUpdateInfo]
  }
  
  extension [Self <: ValueUpdateInfo](x: Self) {
    
    inline def setSource(value: "internal" | "external"): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: "valueUpdate"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
