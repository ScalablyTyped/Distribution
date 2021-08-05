package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEbsBlockDevice extends StObject {
  
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The name of the device to mount.
    */
  var deviceName: Input[String]
  
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1/io2"`.
    */
  var iops: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: js.UndefOr[Input[String]] = js.undefined
  
  var volumeId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`
    * or `"io2"`. (Default: `"gp2"`).
    */
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}
object InstanceEbsBlockDevice {
  
  inline def apply(deviceName: Input[String]): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
  
  extension [Self <: InstanceEbsBlockDevice](x: Self) {
    
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
    
    inline def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    inline def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    inline def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
