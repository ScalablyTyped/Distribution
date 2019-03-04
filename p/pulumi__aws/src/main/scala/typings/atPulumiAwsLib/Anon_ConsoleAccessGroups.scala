package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccessGroups extends js.Object {
  var consoleAccess: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var groups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var password: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var username: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ConsoleAccessGroups {
  @scala.inline
  def apply(
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    consoleAccess: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    groups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_ConsoleAccessGroups = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (consoleAccess != null) __obj.updateDynamic("consoleAccess")(consoleAccess.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConsoleAccessGroups]
  }
}

