package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleRules extends js.Object {
  var role: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var rules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DestinationFilter]]]
}

object Anon_RoleRules {
  @scala.inline
  def apply(
    role: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    rules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DestinationFilter]]]
  ): Anon_RoleRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RoleRules]
  }
}

