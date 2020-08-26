package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
@js.native
trait CSIPersistentVolumeSource extends js.Object {
  /**
    * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerExpandSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  var driver: Input[String] = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Attributes of the volume to publish.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: Input[String] = js.native
}

object CSIPersistentVolumeSource {
  @scala.inline
  def apply(driver: Input[String], volumeHandle: Input[String]): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
  @scala.inline
  implicit class CSIPersistentVolumeSourceOps[Self <: CSIPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriver(value: Input[String]): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeHandle(value: Input[String]): Self = this.set("volumeHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setControllerExpandSecretRef(value: Input[SecretReference]): Self = this.set("controllerExpandSecretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllerExpandSecretRef: Self = this.set("controllerExpandSecretRef", js.undefined)
    @scala.inline
    def setControllerPublishSecretRef(value: Input[SecretReference]): Self = this.set("controllerPublishSecretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllerPublishSecretRef: Self = this.set("controllerPublishSecretRef", js.undefined)
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    @scala.inline
    def setNodePublishSecretRef(value: Input[SecretReference]): Self = this.set("nodePublishSecretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePublishSecretRef: Self = this.set("nodePublishSecretRef", js.undefined)
    @scala.inline
    def setNodeStageSecretRef(value: Input[SecretReference]): Self = this.set("nodeStageSecretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeStageSecretRef: Self = this.set("nodeStageSecretRef", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setVolumeAttributes(value: Input[StringDictionary[Input[String]]]): Self = this.set("volumeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAttributes: Self = this.set("volumeAttributes", js.undefined)
  }
  
}

