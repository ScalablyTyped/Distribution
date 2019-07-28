package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScriptLocationInput extends js.Object {
  var name: js.UndefOr[Input[String]] = js.undefined
  var scriptLocation: Input[String]
}

object Anon_NameScriptLocationInput {
  @scala.inline
  def apply(scriptLocation: Input[String], name: Input[String] = null): Anon_NameScriptLocationInput = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameScriptLocationInput]
  }
}

