package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnTimeoutWaitTimeInMinutes extends js.Object {
  var actionOnTimeout: js.UndefOr[Input[String]] = js.undefined
  var waitTimeInMinutes: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_ActionOnTimeoutWaitTimeInMinutes {
  @scala.inline
  def apply(actionOnTimeout: Input[String] = null, waitTimeInMinutes: Input[Double] = null): Anon_ActionOnTimeoutWaitTimeInMinutes = {
    val __obj = js.Dynamic.literal()
    if (actionOnTimeout != null) __obj.updateDynamic("actionOnTimeout")(actionOnTimeout.asInstanceOf[js.Any])
    if (waitTimeInMinutes != null) __obj.updateDynamic("waitTimeInMinutes")(waitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOnTimeoutWaitTimeInMinutes]
  }
}

