package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScriptLocationInput extends js.Object {
  var name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var scriptLocation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_NameScriptLocationInput {
  @scala.inline
  def apply(
    scriptLocation: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_NameScriptLocationInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scriptLocation")(scriptLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameScriptLocationInput]
  }
}

