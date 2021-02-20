package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateBlockDeviceMappingEb extends StObject {
  
  var deleteOnTermination: String = js.native
  
  var encrypted: String = js.native
  
  var iops: Double = js.native
  
  var kmsKeyId: String = js.native
  
  var snapshotId: String = js.native
  
  var volumeSize: Double = js.native
  
  var volumeType: String = js.native
}
object GetLaunchTemplateBlockDeviceMappingEb {
  
  @scala.inline
  def apply(
    deleteOnTermination: String,
    encrypted: String,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchTemplateBlockDeviceMappingEb = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMappingEb]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateBlockDeviceMappingEbMutableBuilder[Self <: GetLaunchTemplateBlockDeviceMappingEb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: String): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: String): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
