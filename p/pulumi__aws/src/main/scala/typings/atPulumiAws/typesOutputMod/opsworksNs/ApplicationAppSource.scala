package typings.atPulumiAws.typesOutputMod.opsworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationAppSource extends js.Object {
  /**
    * Password to use when authenticating to the source.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[String] = js.undefined
  /**
    * SSH key to use when authenticating to the source.
    */
  var sshKey: js.UndefOr[String] = js.undefined
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: String
  /**
    * The URL where the app resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[String] = js.undefined
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
    __obj.updateDynamic("type")(`type`)
    if (password != null) __obj.updateDynamic("password")(password)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ApplicationAppSource]
  }
}

