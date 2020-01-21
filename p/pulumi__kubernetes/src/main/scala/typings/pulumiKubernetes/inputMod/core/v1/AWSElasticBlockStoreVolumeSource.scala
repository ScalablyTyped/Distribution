package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Persistent Disk resource in AWS.
  *
  * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same
  * AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS
  * volumes support ownership management and SELinux relabeling.
  */
trait AWSElasticBlockStoreVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by
    * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
    * the volume partition for /dev/sda is "0" (or you can leave the property empty).
    */
  var partition: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If
    * omitted, the default is "false". More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var volumeID: Input[String]
}

object AWSElasticBlockStoreVolumeSource {
  @scala.inline
  def apply(
    volumeID: Input[String],
    fsType: Input[String] = null,
    partition: Input[Double] = null,
    readOnly: Input[Boolean] = null
  ): AWSElasticBlockStoreVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSElasticBlockStoreVolumeSource]
  }
}

