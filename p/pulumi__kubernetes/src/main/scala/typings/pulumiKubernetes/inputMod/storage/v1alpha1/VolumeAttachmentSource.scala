package typings.pulumiKubernetes.inputMod.storage.v1alpha1

import typings.pulumiKubernetes.inputMod.core.v1.PersistentVolumeSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentSource represents a volume that should be attached. Right now only
  * PersistenVolumes can be attached via external attacher, in future we may allow also inline
  * volumes in pods. Exactly one member can be set.
  */
trait VolumeAttachmentSource extends js.Object {
  /**
    * inlineVolumeSpec contains all the information necessary to attach a persistent volume
    * defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration
    * feature. It contains translated fields from a pod's inline VolumeSource to a
    * PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled
    * the CSIMigration feature.
    */
  var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpec]] = js.undefined
  /**
    * Name of the persistent volume to attach.
    */
  var persistentVolumeName: js.UndefOr[Input[String]] = js.undefined
}

object VolumeAttachmentSource {
  @scala.inline
  def apply(inlineVolumeSpec: Input[PersistentVolumeSpec] = null, persistentVolumeName: Input[String] = null): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal()
    if (inlineVolumeSpec != null) __obj.updateDynamic("inlineVolumeSpec")(inlineVolumeSpec.asInstanceOf[js.Any])
    if (persistentVolumeName != null) __obj.updateDynamic("persistentVolumeName")(persistentVolumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
}

