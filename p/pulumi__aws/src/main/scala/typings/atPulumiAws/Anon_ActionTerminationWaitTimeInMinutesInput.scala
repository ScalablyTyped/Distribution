package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionTerminationWaitTimeInMinutesInput extends js.Object {
  var action: js.UndefOr[Input[String]] = js.undefined
  var terminationWaitTimeInMinutes: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_ActionTerminationWaitTimeInMinutesInput {
  @scala.inline
  def apply(action: Input[String] = null, terminationWaitTimeInMinutes: Input[Double] = null): Anon_ActionTerminationWaitTimeInMinutesInput = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (terminationWaitTimeInMinutes != null) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionTerminationWaitTimeInMinutesInput]
  }
}

