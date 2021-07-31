package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypeFpga extends StObject {
  
  var count: Double
  
  var manufacturer: String
  
  /**
    * Size of the instance memory, in MiB.
    */
  var memorySize: Double
  
  var name: String
}
object GetInstanceTypeFpga {
  
  @scala.inline
  def apply(count: Double, manufacturer: String, memorySize: Double, name: String): GetInstanceTypeFpga = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeFpga]
  }
  
  @scala.inline
  implicit class GetInstanceTypeFpgaMutableBuilder[Self <: GetInstanceTypeFpga] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
