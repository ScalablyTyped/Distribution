package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRootBlockDevice extends StObject {
  
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
    * Enable volume encryption. (Default: `false`). Must be configured to perform drift detection.
    */
  var encrypted: Boolean
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This is only valid for `volumeType` of `"io1/io2"`, and must be specified if
    * using that type
    */
  var iops: Double
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String
  
  var volumeId: String
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`, `"io2"`, `"sc1"`, or `"st1"`. (Default: `"gp2"`).
    */
  var volumeType: String
}
object InstanceRootBlockDevice {
  
  inline def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): InstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRootBlockDevice]
  }
  
  extension [Self <: InstanceRootBlockDevice](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeSize(value: Double): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
