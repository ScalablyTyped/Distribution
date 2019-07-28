package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortToPortInput extends js.Object {
  var fromPort: js.UndefOr[Input[Double]] = js.undefined
  var toPort: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_FromPortToPortInput {
  @scala.inline
  def apply(fromPort: Input[Double] = null, toPort: Input[Double] = null): Anon_FromPortToPortInput = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromPortToPortInput]
  }
}

