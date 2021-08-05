package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypeInferenceAccelerator extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var manufacturer: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object GetInstanceTypeInferenceAccelerator {
  
  inline def apply(): GetInstanceTypeInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeInferenceAccelerator]
  }
  
  extension [Self <: GetInstanceTypeInferenceAccelerator](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
