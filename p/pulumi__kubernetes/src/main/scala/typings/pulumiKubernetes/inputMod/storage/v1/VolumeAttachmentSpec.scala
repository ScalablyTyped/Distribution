package typings.pulumiKubernetes.inputMod.storage.v1

import typings.pulumiPulumi.outputMod.Input
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
  var attacher: Input[String]
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: Input[String]
  /**
    * Source represents the volume that should be attached.
    */
  var source: Input[VolumeAttachmentSource]
}

object VolumeAttachmentSpec {
  @scala.inline
  def apply(attacher: Input[String], nodeName: Input[String], source: Input[VolumeAttachmentSource]): VolumeAttachmentSpec = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSpec]
  }
}

