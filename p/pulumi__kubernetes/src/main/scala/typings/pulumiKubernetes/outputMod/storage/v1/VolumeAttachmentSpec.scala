package typings.pulumiKubernetes.outputMod.storage.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
trait VolumeAttachmentSpec extends js.Object {
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the
    * name returned by GetPluginName().
    */
  val attacher: String
  /**
    * The node that the volume should be attached to.
    */
  val nodeName: String
  /**
    * Source represents the volume that should be attached.
    */
  val source: VolumeAttachmentSource
}

object VolumeAttachmentSpec {
  @scala.inline
  def apply(attacher: String, nodeName: String, source: VolumeAttachmentSource): VolumeAttachmentSpec = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VolumeAttachmentSpec]
  }
}

