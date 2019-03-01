package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevisionSshKeyType extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var revision: js.UndefOr[java.lang.String] = js.undefined
  var sshKey: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var url: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PasswordRevisionSshKeyType {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    url: java.lang.String,
    password: java.lang.String = null,
    revision: java.lang.String = null,
    sshKey: java.lang.String = null,
    username: java.lang.String = null
  ): Anon_PasswordRevisionSshKeyType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("url")(url)
    if (password != null) __obj.updateDynamic("password")(password)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_PasswordRevisionSshKeyType]
  }
}

