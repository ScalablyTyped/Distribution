package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val chapAuthDiscovery: Boolean
  /**
    * whether support iSCSI Session CHAP authentication
    */
  val chapAuthSession: Boolean
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  val fsType: String
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
    * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
    * connection.
    */
  val initiatorName: String
  /**
    * Target iSCSI Qualified Name.
    */
  val iqn: String
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  val iscsiInterface: String
  /**
    * iSCSI Target Lun number.
    */
  val lun: Double
  /**
    * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other
    * than default (typically TCP ports 860 and 3260).
    */
  val portals: js.Array[String]
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  val readOnly: Boolean
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  val secretRef: SecretReference
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
    * default (typically TCP ports 860 and 3260).
    */
  val targetPortal: String
}

object ISCSIPersistentVolumeSource {
  @scala.inline
  def apply(
    chapAuthDiscovery: Boolean,
    chapAuthSession: Boolean,
    fsType: String,
    initiatorName: String,
    iqn: String,
    iscsiInterface: String,
    lun: Double,
    portals: js.Array[String],
    readOnly: Boolean,
    secretRef: SecretReference,
    targetPortal: String
  ): ISCSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(chapAuthDiscovery = chapAuthDiscovery, chapAuthSession = chapAuthSession, fsType = fsType, initiatorName = initiatorName, iqn = iqn, iscsiInterface = iscsiInterface, lun = lun, portals = portals, readOnly = readOnly, secretRef = secretRef, targetPortal = targetPortal)
  
    __obj.asInstanceOf[ISCSIPersistentVolumeSource]
  }
}

