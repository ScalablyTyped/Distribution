package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionInput extends js.Object {
  var action: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ActionInput {
  @scala.inline
  def apply(action: Input[String] = null): Anon_ActionInput = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionInput]
  }
}

