package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns

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
  val attacher: java.lang.String
  /**
    * The node that the volume should be attached to.
    */
  val nodeName: java.lang.String
  /**
    * Source represents the volume that should be attached.
    */
  val source: VolumeAttachmentSource
}

