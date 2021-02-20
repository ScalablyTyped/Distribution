package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeGpus extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * Size of the instance memory, in MiB.
    */
  var memorySize: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object GetInstanceTypeGpus {
  
  @scala.inline
  def apply(): GetInstanceTypeGpus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeGpus]
  }
  
  @scala.inline
  implicit class GetInstanceTypeGpusMutableBuilder[Self <: GetInstanceTypeGpus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
