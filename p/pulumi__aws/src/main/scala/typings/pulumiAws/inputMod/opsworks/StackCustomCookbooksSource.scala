package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackCustomCookbooksSource extends js.Object {
  /**
    * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[Input[String]] = js.native
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[Input[String]] = js.native
  /**
    * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[Input[String]] = js.native
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: Input[String] = js.native
  /**
    * The URL where the cookbooks resource can be found.
    */
  var url: Input[String] = js.native
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[Input[String]] = js.native
}

object StackCustomCookbooksSource {
  @scala.inline
  def apply(
    `type`: Input[String],
    url: Input[String],
    password: Input[String] = null,
    revision: Input[String] = null,
    sshKey: Input[String] = null,
    username: Input[String] = null
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

