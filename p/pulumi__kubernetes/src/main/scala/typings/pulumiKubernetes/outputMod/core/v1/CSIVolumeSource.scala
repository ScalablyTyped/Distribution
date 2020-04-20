package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a source location of a volume to mount, managed by an external CSI driver
  */
trait CSIVolumeSource extends js.Object {
  /**
    * Driver is the name of the CSI driver that handles this volume. Consult with your admin for
    * the correct name as registered in the cluster.
    */
  val driver: String
  /**
    * Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is
    * passed to the associated CSI driver which will determine the default filesystem to apply.
    */
  val fsType: String
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and  may be empty if no secret is required. If the secret
    * object contains more than one secret, all secret references are passed.
    */
  val nodePublishSecretRef: LocalObjectReference
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  val readOnly: Boolean
  /**
    * VolumeAttributes stores driver-specific properties that are passed to the CSI driver.
    * Consult your driver's documentation for supported values.
    */
  val volumeAttributes: StringDictionary[String]
}

object CSIVolumeSource {
  @scala.inline
  def apply(
    driver: String,
    fsType: String,
    nodePublishSecretRef: LocalObjectReference,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String]
  ): CSIVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], nodePublishSecretRef = nodePublishSecretRef.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeAttributes = volumeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIVolumeSource]
  }
}

