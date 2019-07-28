package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyTypeValueInput extends js.Object {
  var key: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
  var value: js.UndefOr[Input[String]] = js.undefined
}

object Anon_KeyTypeValueInput {
  @scala.inline
  def apply(key: Input[String] = null, `type`: Input[String] = null, value: Input[String] = null): Anon_KeyTypeValueInput = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyTypeValueInput]
  }
}

