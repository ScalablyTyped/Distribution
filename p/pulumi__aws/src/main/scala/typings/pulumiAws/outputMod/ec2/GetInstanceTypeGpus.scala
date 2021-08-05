package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypeGpus extends StObject {
  
  var count: Double
  
  var manufacturer: String
  
  /**
    * Size of the instance memory, in MiB.
    */
  var memorySize: Double
  
  var name: String
}
object GetInstanceTypeGpus {
  
  inline def apply(count: Double, manufacturer: String, memorySize: Double, name: String): GetInstanceTypeGpus = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeGpus]
  }
  
  extension [Self <: GetInstanceTypeGpus](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
