package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns

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
    * Name of the persistent volume to attach.
    */
  val persistentVolumeName: java.lang.String
}

object VolumeAttachmentSource {
  @scala.inline
  def apply(persistentVolumeName: java.lang.String): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("persistentVolumeName")(persistentVolumeName)
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
}

