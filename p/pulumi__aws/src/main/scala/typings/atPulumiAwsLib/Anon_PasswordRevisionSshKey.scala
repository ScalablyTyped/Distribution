package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevisionSshKey extends js.Object {
  var password: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var revision: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sshKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var url: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var username: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_PasswordRevisionSshKey {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    revision: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sshKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    url: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_PasswordRevisionSshKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PasswordRevisionSshKey]
  }
}

