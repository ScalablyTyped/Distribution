package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordUrl extends js.Object {
  var password: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var url: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var username: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_PasswordUrl {
  @scala.inline
  def apply(
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    url: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_PasswordUrl = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PasswordUrl]
  }
}

