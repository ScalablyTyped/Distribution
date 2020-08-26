package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Persistent Disk resource in AWS.
  *
  * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
  */
@js.native
trait AWSElasticBlockStoreVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var fsType: String = js.native
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
    */
  var partition: Double = js.native
  /**
    * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var readOnly: Boolean = js.native
  /**
    * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var volumeID: String = js.native
}

object AWSElasticBlockStoreVolumeSource {
  @scala.inline
  def apply(fsType: String, partition: Double, readOnly: Boolean, volumeID: String): AWSElasticBlockStoreVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSElasticBlockStoreVolumeSource]
  }
  @scala.inline
  implicit class AWSElasticBlockStoreVolumeSourceOps[Self <: AWSElasticBlockStoreVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeID(value: String): Self = this.set("volumeID", value.asInstanceOf[js.Any])
  }
  
}

