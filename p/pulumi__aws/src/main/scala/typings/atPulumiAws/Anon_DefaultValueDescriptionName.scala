package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueDescriptionName extends js.Object {
  var defaultValue: js.UndefOr[Input[String]] = js.undefined
  var description: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DefaultValueDescriptionName {
  @scala.inline
  def apply(
    defaultValue: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    `type`: Input[String] = null
  ): Anon_DefaultValueDescriptionName = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueDescriptionName]
  }
}

