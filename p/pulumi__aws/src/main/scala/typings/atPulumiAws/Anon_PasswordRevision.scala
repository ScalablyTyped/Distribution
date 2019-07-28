package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevision extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var revision: js.UndefOr[String] = js.undefined
  var sshKey: js.UndefOr[String] = js.undefined
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_PasswordRevision {
  @scala.inline
  def apply(
    `type`: String,
    password: String = null,
    revision: String = null,
    sshKey: String = null,
    url: String = null,
    username: String = null
  ): Anon_PasswordRevision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (password != null) __obj.updateDynamic("password")(password)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_PasswordRevision]
  }
}

