package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateBlockDeviceMappingEbs extends StObject {
  
  /**
    * Whether the volume should be destroyed on instance termination. Defaults to `false` if not set. See [Preserving Amazon EBS Volumes on Instance Termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination) for more information.
    */
  var deleteOnTermination: js.UndefOr[String] = js.undefined
  
  /**
    * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`.
    */
  var encrypted: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1/io2"`.
    */
  var iops: Double
  
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted volume.
    * `encrypted` must be set to `true` when this is set.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the volume in gigabytes.
    */
  var volumeSize: Double
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"` or `"io2"`. (Default: `"standard"`).
    */
  var volumeType: String
}
object LaunchTemplateBlockDeviceMappingEbs {
  
  inline def apply(iops: Double, volumeSize: Double, volumeType: String): LaunchTemplateBlockDeviceMappingEbs = {
    val __obj = js.Dynamic.literal(iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingEbs]
  }
  
  extension [Self <: LaunchTemplateBlockDeviceMappingEbs](x: Self) {
    
    inline def setDeleteOnTermination(value: String): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: String): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
