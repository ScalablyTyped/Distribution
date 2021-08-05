package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecificationEbsBlockDevice extends StObject {
  
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  
  var deviceName: Input[String]
  
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  
  var iops: js.UndefOr[Input[Double]] = js.undefined
  
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  
  var snapshotId: js.UndefOr[Input[String]] = js.undefined
  
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}
object SpotFleetRequestLaunchSpecificationEbsBlockDevice {
  
  inline def apply(deviceName: Input[String]): SpotFleetRequestLaunchSpecificationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEbsBlockDevice]
  }
  
  extension [Self <: SpotFleetRequestLaunchSpecificationEbsBlockDevice](x: Self) {
    
    inline def setDeleteOnTermination(value: Input[Boolean]): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    inline def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
