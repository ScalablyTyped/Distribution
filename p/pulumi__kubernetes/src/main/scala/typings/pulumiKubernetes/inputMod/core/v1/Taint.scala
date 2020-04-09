package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var effect: Input[String]
  /**
    * Required. The taint key to be applied to a node.
    */
  var key: Input[String]
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for
    * NoExecute taints.
    */
  var timeAdded: js.UndefOr[Input[String]] = js.undefined
  /**
    * The taint value corresponding to the taint key.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}

object Taint {
  @scala.inline
  def apply(
    effect: Input[String],
    key: Input[String],
    timeAdded: Input[String] = null,
    value: Input[String] = null
  ): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (timeAdded != null) __obj.updateDynamic("timeAdded")(timeAdded.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
}

