package typings.atPulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
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
  var driver: Input[String]
  /**
    * Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is
    * passed to the associated CSI driver which will determine the default filesystem to apply.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and  may be empty if no secret is required. If the secret
    * object contains more than one secret, all secret references are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * VolumeAttributes stores driver-specific properties that are passed to the CSI driver.
    * Consult your driver's documentation for supported values.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object CSIVolumeSource {
  @scala.inline
  def apply(
    driver: Input[String],
    fsType: Input[String] = null,
    nodePublishSecretRef: Input[LocalObjectReference] = null,
    readOnly: Input[Boolean] = null,
    volumeAttributes: Input[StringDictionary[Input[String]]] = null
  ): CSIVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (nodePublishSecretRef != null) __obj.updateDynamic("nodePublishSecretRef")(nodePublishSecretRef.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (volumeAttributes != null) __obj.updateDynamic("volumeAttributes")(volumeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIVolumeSource]
  }
}

