package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Persistent Disk resource in AWS.
  *
  * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
  */
trait AWSElasticBlockStoreVolumeSource extends StObject {
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
    */
  var partition: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var volumeID: Input[String]
}
object AWSElasticBlockStoreVolumeSource {
  
  inline def apply(volumeID: Input[String]): AWSElasticBlockStoreVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSElasticBlockStoreVolumeSource]
  }
  
  extension [Self <: AWSElasticBlockStoreVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setPartition(value: Input[Double]): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setVolumeID(value: Input[String]): Self = StObject.set(x, "volumeID", value.asInstanceOf[js.Any])
  }
}
