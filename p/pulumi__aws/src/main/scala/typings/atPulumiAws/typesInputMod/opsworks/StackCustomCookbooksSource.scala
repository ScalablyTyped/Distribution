package typings.atPulumiAws.typesInputMod.opsworks

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackCustomCookbooksSource extends js.Object {
  var password: js.UndefOr[Input[String]] = js.undefined
  var revision: js.UndefOr[Input[String]] = js.undefined
  var sshKey: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
  var url: Input[String]
  var username: js.UndefOr[Input[String]] = js.undefined
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

