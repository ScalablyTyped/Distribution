package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TransitionToIaInput extends js.Object {
  var transitionToIa: js.UndefOr[Input[String]] = js.undefined
}

object Anon_TransitionToIaInput {
  @scala.inline
  def apply(transitionToIa: Input[String] = null): Anon_TransitionToIaInput = {
    val __obj = js.Dynamic.literal()
    if (transitionToIa != null) __obj.updateDynamic("transitionToIa")(transitionToIa.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TransitionToIaInput]
  }
}

