package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed
  * from.
  */
trait VolumeNodeAffinity extends js.Object {
  /**
    * Required specifies hard node constraints that must be met.
    */
  val required: NodeSelector
}

object VolumeNodeAffinity {
  @scala.inline
  def apply(required: NodeSelector): VolumeNodeAffinity = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeNodeAffinity]
  }
}

