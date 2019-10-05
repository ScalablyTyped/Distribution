package typings.atPulumiKubernetes.typesInputMod.authentication.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserInfo holds the information about the user needed to implement the user.Info interface.
  */
trait UserInfo extends js.Object {
  /**
    * Any additional information provided by the authenticator.
    */
  var extra: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * The names of groups this user is a part of.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A unique value that identifies this user across time. If this user is deleted and another
    * user by the same name is added, they will have different UIDs.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name that uniquely identifies this user among all active users.
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(
    extra: Input[js.Object] = null,
    groups: Input[js.Array[Input[String]]] = null,
    uid: Input[String] = null,
    username: Input[String] = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

