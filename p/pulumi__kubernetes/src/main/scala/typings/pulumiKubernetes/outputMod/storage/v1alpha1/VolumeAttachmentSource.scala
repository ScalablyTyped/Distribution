package typings.pulumiKubernetes.outputMod.storage.v1alpha1

import typings.pulumiKubernetes.outputMod.core.v1.PersistentVolumeSpec
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
  val inlineVolumeSpec: PersistentVolumeSpec
  /**
    * Name of the persistent volume to attach.
    */
  val persistentVolumeName: String
}

object VolumeAttachmentSource {
  @scala.inline
  def apply(inlineVolumeSpec: PersistentVolumeSpec, persistentVolumeName: String): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec.asInstanceOf[js.Any], persistentVolumeName = persistentVolumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
}

