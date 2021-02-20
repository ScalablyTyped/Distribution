package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchConfigurationEbsBlockDevice extends StObject {
  
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean = js.native
  
  /**
    * The Name of the device.
    */
  var deviceName: String = js.native
  
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean = js.native
  
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double = js.native
  
  /**
    * Whether the device in the block device mapping of the AMI is suppressed.
    */
  var noDevice: Boolean = js.native
  
  /**
    * The Snapshot ID of the mount.
    */
  var snapshotId: String = js.native
  
  /**
    * The Size of the volume.
    */
  var volumeSize: Double = js.native
  
  /**
    * The Type of the volume.
    */
  var volumeType: String = js.native
}
object GetLaunchConfigurationEbsBlockDevice {
  
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    noDevice: Boolean,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationEbsBlockDevice]
  }
  
  @scala.inline
  implicit class GetLaunchConfigurationEbsBlockDeviceMutableBuilder[Self <: GetLaunchConfigurationEbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDevice(value: Boolean): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
