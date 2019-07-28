package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValueInput extends js.Object {
  var `type`: js.UndefOr[Input[String]] = js.undefined
  var value: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_TypeValueInput {
  @scala.inline
  def apply(`type`: Input[String] = null, value: Input[Double] = null): Anon_TypeValueInput = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValueInput]
  }
}

