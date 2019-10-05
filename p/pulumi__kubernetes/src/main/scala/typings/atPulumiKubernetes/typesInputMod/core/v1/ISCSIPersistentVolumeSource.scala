package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var chapAuthDiscovery: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
    * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
    * connection.
    */
  var initiatorName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: Input[String]
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: js.UndefOr[Input[String]] = js.undefined
  /**
    * iSCSI Target Lun number.
    */
  var lun: Input[Double]
  /**
    * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other
    * than default (typically TCP ports 860 and 3260).
    */
  var portals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
    * default (typically TCP ports 860 and 3260).
    */
  var targetPortal: Input[String]
}

object ISCSIPersistentVolumeSource {
  @scala.inline
  def apply(
    iqn: Input[String],
    lun: Input[Double],
    targetPortal: Input[String],
    chapAuthDiscovery: Input[Boolean] = null,
    chapAuthSession: Input[Boolean] = null,
    fsType: Input[String] = null,
    initiatorName: Input[String] = null,
    iscsiInterface: Input[String] = null,
    portals: Input[js.Array[Input[String]]] = null,
    readOnly: Input[Boolean] = null,
    secretRef: Input[SecretReference] = null
  ): ISCSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(iqn = iqn.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    if (chapAuthDiscovery != null) __obj.updateDynamic("chapAuthDiscovery")(chapAuthDiscovery.asInstanceOf[js.Any])
    if (chapAuthSession != null) __obj.updateDynamic("chapAuthSession")(chapAuthSession.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (initiatorName != null) __obj.updateDynamic("initiatorName")(initiatorName.asInstanceOf[js.Any])
    if (iscsiInterface != null) __obj.updateDynamic("iscsiInterface")(iscsiInterface.asInstanceOf[js.Any])
    if (portals != null) __obj.updateDynamic("portals")(portals.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIPersistentVolumeSource]
  }
}

