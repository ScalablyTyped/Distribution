package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortToPortInput extends js.Object {
  var fromPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var toPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_FromPortToPortInput {
  @scala.inline
  def apply(
    fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    toPort: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_FromPortToPortInput = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromPortToPortInput]
  }
}

