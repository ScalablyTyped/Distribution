package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeInferenceAccelerator extends StObject {
  
  var count: Double = js.native
  
  var manufacturer: String = js.native
  
  var name: String = js.native
}
object GetInstanceTypeInferenceAccelerator {
  
  @scala.inline
  def apply(count: Double, manufacturer: String, name: String): GetInstanceTypeInferenceAccelerator = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeInferenceAccelerator]
  }
  
  @scala.inline
  implicit class GetInstanceTypeInferenceAcceleratorMutableBuilder[Self <: GetInstanceTypeInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
