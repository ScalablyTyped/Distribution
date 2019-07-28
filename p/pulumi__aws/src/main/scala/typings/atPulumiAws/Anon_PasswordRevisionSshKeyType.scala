package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevisionSshKeyType extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var revision: js.UndefOr[String] = js.undefined
  var sshKey: js.UndefOr[String] = js.undefined
  var `type`: String
  var url: String
  var username: js.UndefOr[String] = js.undefined
}

object Anon_PasswordRevisionSshKeyType {
  @scala.inline
  def apply(
    `type`: String,
    url: String,
    password: String = null,
    revision: String = null,
    sshKey: String = null,
    username: String = null
  ): Anon_PasswordRevisionSshKeyType = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    if (password != null) __obj.updateDynamic("password")(password)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_PasswordRevisionSshKeyType]
  }
}

