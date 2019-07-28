package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccessGroups extends js.Object {
  var consoleAccess: js.UndefOr[Input[Boolean]] = js.undefined
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var password: Input[String]
  var username: Input[String]
}

object Anon_ConsoleAccessGroups {
  @scala.inline
  def apply(
    password: Input[String],
    username: Input[String],
    consoleAccess: Input[Boolean] = null,
    groups: Input[js.Array[Input[String]]] = null
  ): Anon_ConsoleAccessGroups = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (consoleAccess != null) __obj.updateDynamic("consoleAccess")(consoleAccess.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConsoleAccessGroups]
  }
}

