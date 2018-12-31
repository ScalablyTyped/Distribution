package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
trait CSIPersistentVolumeSource extends js.Object {
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
  val driver: java.lang.String
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs".
    */
  val fsType: java.lang.String
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
  val readOnly: scala.Boolean
  /**
    * Attributes of the volume to publish.
    */
  val volumeAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
    * to refer to the volume on all subsequent calls. Required.
    */
  val volumeHandle: java.lang.String
}

