package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAppSource extends js.Object {
  /**
    * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[String] = js.native
  /**
    * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[String] = js.native
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: String = js.native
  /**
    * The URL where the app resource can be found.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[String] = js.native
}

object ApplicationAppSource {
  @scala.inline
  def apply(
    `type`: String,
    password: String = null,
    revision: String = null,
    sshKey: String = null,
    url: String = null,
    username: String = null
  ): ApplicationAppSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppSource]
  }
}

