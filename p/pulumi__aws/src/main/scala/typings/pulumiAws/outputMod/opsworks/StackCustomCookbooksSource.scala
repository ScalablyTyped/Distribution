package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackCustomCookbooksSource extends js.Object {
  var password: js.UndefOr[String] = js.native
  var revision: js.UndefOr[String] = js.native
  var sshKey: js.UndefOr[String] = js.native
  var `type`: String = js.native
  var url: String = js.native
  var username: js.UndefOr[String] = js.native
}

object StackCustomCookbooksSource {
  @scala.inline
  def apply(
    `type`: String,
    url: String,
    password: String = null,
    revision: String = null,
    sshKey: String = null,
    username: String = null
  ): StackCustomCookbooksSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCustomCookbooksSource]
  }
}

