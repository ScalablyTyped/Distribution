package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val fsType: java.lang.String
  /**
               * The partition in the volume that you want to mount. If omitted, the default is to mount by
               * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
               * the volume partition for /dev/sda is "0" (or you can leave the property empty).
               */
  val partition: scala.Double
  /**
               * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If
               * omitted, the default is "false". More info:
               * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
               */
  val readOnly: scala.Boolean
  /**
               * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
               * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
               */
  val volumeID: java.lang.String
}

