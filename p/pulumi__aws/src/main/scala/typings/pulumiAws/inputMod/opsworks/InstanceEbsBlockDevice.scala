package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEbsBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  
  var deviceName: Input[String]
  
  var iops: js.UndefOr[Input[Double]] = js.undefined
  
  var snapshotId: js.UndefOr[Input[String]] = js.undefined
  
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}
object InstanceEbsBlockDevice {
  
  @scala.inline
  def apply(deviceName: Input[String]): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
  
  @scala.inline
  implicit class InstanceEbsBlockDeviceMutableBuilder[Self <: InstanceEbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Input[Boolean]): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
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
