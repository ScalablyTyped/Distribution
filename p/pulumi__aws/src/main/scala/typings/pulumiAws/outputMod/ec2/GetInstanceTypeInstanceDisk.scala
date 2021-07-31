package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypeInstanceDisk extends StObject {
  
  var count: Double
  
  var size: Double
  
  var `type`: String
}
object GetInstanceTypeInstanceDisk {
  
  @scala.inline
  def apply(count: Double, size: Double, `type`: String): GetInstanceTypeInstanceDisk = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeInstanceDisk]
  }
  
  @scala.inline
  implicit class GetInstanceTypeInstanceDiskMutableBuilder[Self <: GetInstanceTypeInstanceDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
