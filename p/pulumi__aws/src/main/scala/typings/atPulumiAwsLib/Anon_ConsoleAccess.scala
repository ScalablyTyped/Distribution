package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccess extends js.Object {
  var consoleAccess: js.UndefOr[scala.Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var password: java.lang.String
  var username: java.lang.String
}

object Anon_ConsoleAccess {
  @scala.inline
  def apply(
    password: java.lang.String,
    username: java.lang.String,
    consoleAccess: js.UndefOr[scala.Boolean] = js.undefined,
    groups: js.Array[java.lang.String] = null
  ): Anon_ConsoleAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    if (!js.isUndefined(consoleAccess)) __obj.updateDynamic("consoleAccess")(consoleAccess)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[Anon_ConsoleAccess]
  }
}

