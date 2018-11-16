package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as
         * read/write once. ISCSI volumes support ownership management and SELinux relabeling.
         */

trait ISCSIPersistentVolumeSource extends js.Object {
  /**
               * whether support iSCSI Discovery CHAP authentication
               */
  val chapAuthDiscovery: scala.Boolean
  /**
               * whether support iSCSI Session CHAP authentication
               */
  val chapAuthSession: scala.Boolean
  /**
               * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
               * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
               * inferred to be "ext4" if unspecified. More info:
               * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
               */
  val fsType: java.lang.String
  /**
               * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
               * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
               * connection.
               */
  val initiatorName: java.lang.String
  /**
               * Target iSCSI Qualified Name.
               */
  val iqn: java.lang.String
  /**
               * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
               */
  val iscsiInterface: java.lang.String
  /**
               * iSCSI Target Lun number.
               */
  val lun: scala.Double
  /**
               * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other
               * than default (typically TCP ports 860 and 3260).
               */
  val portals: js.Array[java.lang.String]
  /**
               * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
               */
  val readOnly: scala.Boolean
  /**
               * CHAP Secret for iSCSI target and initiator authentication
               */
  val secretRef: SecretReference
  /**
               * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
               * default (typically TCP ports 860 and 3260).
               */
  val targetPortal: java.lang.String
}

