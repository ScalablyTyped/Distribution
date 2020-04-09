package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The node this Taint is attached to has the "effect" on any pod that does not tolerate the
  * Taint.
  */
trait Taint extends js.Object {
  /**
    * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
    * NoSchedule, PreferNoSchedule and NoExecute.
    */
  val effect: String
  /**
    * Required. The taint key to be applied to a node.
    */
  val key: String
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for
    * NoExecute taints.
    */
  val timeAdded: String
  /**
    * The taint value corresponding to the taint key.
    */
  val value: String
}

object Taint {
  @scala.inline
  def apply(effect: String, key: String, timeAdded: String, value: String): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeAdded = timeAdded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Taint]
  }
}

