package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccess extends js.Object {
  var consoleAccess: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var password: String
  var username: String
}

object Anon_ConsoleAccess {
  @scala.inline
  def apply(
    password: String,
    username: String,
    consoleAccess: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null
  ): Anon_ConsoleAccess = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (!js.isUndefined(consoleAccess)) __obj.updateDynamic("consoleAccess")(consoleAccess)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[Anon_ConsoleAccess]
  }
}

