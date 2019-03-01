package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevision extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var revision: js.UndefOr[java.lang.String] = js.undefined
  var sshKey: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PasswordRevision {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    password: java.lang.String = null,
    revision: java.lang.String = null,
    sshKey: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null
  ): Anon_PasswordRevision = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (password != null) __obj.updateDynamic("password")(password)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_PasswordRevision]
  }
}

