package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeInstanceDisk extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object GetInstanceTypeInstanceDisk {
  
  @scala.inline
  def apply(): GetInstanceTypeInstanceDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeInstanceDisk]
  }
  
  @scala.inline
  implicit class GetInstanceTypeInstanceDiskMutableBuilder[Self <: GetInstanceTypeInstanceDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
