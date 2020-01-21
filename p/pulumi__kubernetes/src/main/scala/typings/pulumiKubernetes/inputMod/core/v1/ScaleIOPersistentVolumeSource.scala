package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Default is "xfs"
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The host address of the ScaleIO API Gateway.
    */
  var gateway: Input[String]
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: js.UndefOr[Input[String]] = js.undefined
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If
    * this is not provided, Login operation will fail.
    */
  var secretRef: Input[SecretReference]
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
    * Default is ThinProvisioned.
    */
  var storageMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  var system: Input[String]
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this
    * volume source.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}

object ScaleIOPersistentVolumeSource {
  @scala.inline
  def apply(
    gateway: Input[String],
    secretRef: Input[SecretReference],
    system: Input[String],
    fsType: Input[String] = null,
    protectionDomain: Input[String] = null,
    readOnly: Input[Boolean] = null,
    sslEnabled: Input[Boolean] = null,
    storageMode: Input[String] = null,
    storagePool: Input[String] = null,
    volumeName: Input[String] = null
  ): ScaleIOPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (protectionDomain != null) __obj.updateDynamic("protectionDomain")(protectionDomain.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (sslEnabled != null) __obj.updateDynamic("sslEnabled")(sslEnabled.asInstanceOf[js.Any])
    if (storageMode != null) __obj.updateDynamic("storageMode")(storageMode.asInstanceOf[js.Any])
    if (storagePool != null) __obj.updateDynamic("storagePool")(storagePool.asInstanceOf[js.Any])
    if (volumeName != null) __obj.updateDynamic("volumeName")(volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOPersistentVolumeSource]
  }
}

