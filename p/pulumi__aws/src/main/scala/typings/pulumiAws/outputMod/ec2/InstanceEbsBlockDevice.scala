package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEbsBlockDevice extends StObject {
  
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the device to mount.
    */
  var deviceName: String
  
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: Boolean
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1/io2"`.
    */
  var iops: Double
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String
  
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: String
  
  var volumeId: String
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`
    * or `"io2"`. (Default: `"gp2"`).
    */
  var volumeType: String
}
object InstanceEbsBlockDevice {
  
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
  
  @scala.inline
  implicit class InstanceEbsBlockDeviceMutableBuilder[Self <: InstanceEbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
