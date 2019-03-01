package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val effect: java.lang.String
  /**
    * Required. The taint key to be applied to a node.
    */
  val key: java.lang.String
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for
    * NoExecute taints.
    */
  val timeAdded: java.lang.String
  /**
    * Required. The taint value corresponding to the taint key.
    */
  val value: java.lang.String
}

object Taint {
  @scala.inline
  def apply(
    effect: java.lang.String,
    key: java.lang.String,
    timeAdded: java.lang.String,
    value: java.lang.String
  ): Taint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("effect")(effect)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("timeAdded")(timeAdded)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Taint]
  }
}

