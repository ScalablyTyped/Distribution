package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueName extends js.Object {
  var defaultValue: js.UndefOr[Input[String]] = js.undefined
  var name: Input[String]
  var namespace: Input[String]
  var value: Input[String]
}

object Anon_DefaultValueName {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    value: Input[String],
    defaultValue: Input[String] = null
  ): Anon_DefaultValueName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueName]
  }
}

