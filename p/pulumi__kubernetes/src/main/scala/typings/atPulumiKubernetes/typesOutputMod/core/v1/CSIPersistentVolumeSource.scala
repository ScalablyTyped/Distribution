package typings.atPulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  val controllerExpandSecretRef: SecretReference
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerPublishVolume and
    * ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is
    * required. If the secret object contains more than one secret, all secrets are passed.
    */
  val controllerPublishSecretRef: SecretReference
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  val driver: String
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs".
    */
  val fsType: String
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and may be empty if no secret is required. If the secret
    * object contains more than one secret, all secrets are passed.
    */
  val nodePublishSecretRef: SecretReference
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to
    * pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and
    * NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required.
    * If the secret object contains more than one secret, all secrets are passed.
    */
  val nodeStageSecretRef: SecretReference
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
    * (read/write).
    */
  val readOnly: Boolean
  /**
    * Attributes of the volume to publish.
    */
  val volumeAttributes: StringDictionary[String]
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
    * to refer to the volume on all subsequent calls. Required.
    */
  val volumeHandle: String
}

object CSIPersistentVolumeSource {
  @scala.inline
  def apply(
    controllerExpandSecretRef: SecretReference,
    controllerPublishSecretRef: SecretReference,
    driver: String,
    fsType: String,
    nodePublishSecretRef: SecretReference,
    nodeStageSecretRef: SecretReference,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String],
    volumeHandle: String
  ): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(controllerExpandSecretRef = controllerExpandSecretRef, controllerPublishSecretRef = controllerPublishSecretRef, driver = driver, fsType = fsType, nodePublishSecretRef = nodePublishSecretRef, nodeStageSecretRef = nodeStageSecretRef, readOnly = readOnly, volumeAttributes = volumeAttributes, volumeHandle = volumeHandle)
  
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
}

