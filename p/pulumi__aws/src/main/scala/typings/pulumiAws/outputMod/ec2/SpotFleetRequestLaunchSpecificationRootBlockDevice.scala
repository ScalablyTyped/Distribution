package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchSpecificationRootBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  
  var encrypted: Boolean = js.native
  
  var iops: Double = js.native
  
  var kmsKeyId: String = js.native
  
  var volumeSize: Double = js.native
  
  var volumeType: String = js.native
}
object SpotFleetRequestLaunchSpecificationRootBlockDevice {
  
  @scala.inline
  def apply(encrypted: Boolean, iops: Double, kmsKeyId: String, volumeSize: Double, volumeType: String): SpotFleetRequestLaunchSpecificationRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationRootBlockDeviceMutableBuilder[Self <: SpotFleetRequestLaunchSpecificationRootBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
