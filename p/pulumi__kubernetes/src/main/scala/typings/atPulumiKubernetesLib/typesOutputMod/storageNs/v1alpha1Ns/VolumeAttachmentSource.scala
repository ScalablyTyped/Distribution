package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns

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
  val inlineVolumeSpec: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec
  /**
    * Name of the persistent volume to attach.
    */
  val persistentVolumeName: java.lang.String
}

object VolumeAttachmentSource {
  @scala.inline
  def apply(
    inlineVolumeSpec: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec,
    persistentVolumeName: java.lang.String
  ): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec, persistentVolumeName = persistentVolumeName)
  
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
}

