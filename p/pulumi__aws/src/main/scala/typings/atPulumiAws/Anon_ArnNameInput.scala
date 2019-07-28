package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnNameInput extends js.Object {
  var arn: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ArnNameInput {
  @scala.inline
  def apply(arn: Input[String] = null, name: Input[String] = null): Anon_ArnNameInput = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArnNameInput]
  }
}

