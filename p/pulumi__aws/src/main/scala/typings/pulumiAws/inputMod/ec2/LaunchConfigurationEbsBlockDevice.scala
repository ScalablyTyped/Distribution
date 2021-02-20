package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchConfigurationEbsBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  
  var deviceName: Input[String] = js.native
  
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  var iops: js.UndefOr[Input[Double]] = js.native
  
  var noDevice: js.UndefOr[Input[Boolean]] = js.native
  
  var snapshotId: js.UndefOr[Input[String]] = js.native
  
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  
  var volumeType: js.UndefOr[Input[String]] = js.native
}
object LaunchConfigurationEbsBlockDevice {
  
  @scala.inline
  def apply(deviceName: Input[String]): LaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEbsBlockDevice]
  }
  
  @scala.inline
  implicit class LaunchConfigurationEbsBlockDeviceMutableBuilder[Self <: LaunchConfigurationEbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Input[Boolean]): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setNoDevice(value: Input[Boolean]): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
