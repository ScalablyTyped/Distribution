package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StorageOS persistent volume resource.
  */
trait StorageOSVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not
    * specified, default values will be attempted.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only
    * unique within a namespace.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is
    * specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping
    * to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to
    * override the default behaviour. Set to "default" if you are not using namespaces within
    * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  var volumeNamespace: js.UndefOr[Input[String]] = js.undefined
}

object StorageOSVolumeSource {
  @scala.inline
  def apply(
    fsType: Input[String] = null,
    readOnly: Input[Boolean] = null,
    secretRef: Input[LocalObjectReference] = null,
    volumeName: Input[String] = null,
    volumeNamespace: Input[String] = null
  ): StorageOSVolumeSource = {
    val __obj = js.Dynamic.literal()
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    if (volumeName != null) __obj.updateDynamic("volumeName")(volumeName.asInstanceOf[js.Any])
    if (volumeNamespace != null) __obj.updateDynamic("volumeNamespace")(volumeNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOSVolumeSource]
  }
}

