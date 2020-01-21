package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
trait CSIPersistentVolumeSource extends js.Object {
  /**
    * ControllerExpandSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This
    * is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is
    * optional, and may be empty if no secret is required. If the secret object contains more
    * than one secret, all secrets are passed.
    */
  var controllerExpandSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerPublishVolume and
    * ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is
    * required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  var driver: Input[String]
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and may be empty if no secret is required. If the secret
    * object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to
    * pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and
    * NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required.
    * If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
    * (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Attributes of the volume to publish.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
    * to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: Input[String]
}

object CSIPersistentVolumeSource {
  @scala.inline
  def apply(
    driver: Input[String],
    volumeHandle: Input[String],
    controllerExpandSecretRef: Input[SecretReference] = null,
    controllerPublishSecretRef: Input[SecretReference] = null,
    fsType: Input[String] = null,
    nodePublishSecretRef: Input[SecretReference] = null,
    nodeStageSecretRef: Input[SecretReference] = null,
    readOnly: Input[Boolean] = null,
    volumeAttributes: Input[StringDictionary[Input[String]]] = null
  ): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    if (controllerExpandSecretRef != null) __obj.updateDynamic("controllerExpandSecretRef")(controllerExpandSecretRef.asInstanceOf[js.Any])
    if (controllerPublishSecretRef != null) __obj.updateDynamic("controllerPublishSecretRef")(controllerPublishSecretRef.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (nodePublishSecretRef != null) __obj.updateDynamic("nodePublishSecretRef")(nodePublishSecretRef.asInstanceOf[js.Any])
    if (nodeStageSecretRef != null) __obj.updateDynamic("nodeStageSecretRef")(nodeStageSecretRef.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (volumeAttributes != null) __obj.updateDynamic("volumeAttributes")(volumeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
}

