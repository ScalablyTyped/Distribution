package typings.atPulumiAws.typesInputMod.opsworksNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationAppSource extends js.Object {
  /**
    * Password to use when authenticating to the source.
    */
  var password: js.UndefOr[Input[String]] = js.undefined
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[Input[String]] = js.undefined
  /**
    * SSH key to use when authenticating to the source.
    */
  var sshKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: Input[String]
  /**
    * The URL where the app resource can be found.
    */
  var url: js.UndefOr[Input[String]] = js.undefined
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}

object ApplicationAppSource {
  @scala.inline
  def apply(
    `type`: Input[String],
    password: Input[String] = null,
    revision: Input[String] = null,
    sshKey: Input[String] = null,
    url: Input[String] = null,
    username: Input[String] = null
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

