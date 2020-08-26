package typings.pulumiKubernetes.outputMod.authentication.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserInfo holds the information about the user needed to implement the user.Info interface.
  */
@js.native
trait UserInfo extends js.Object {
  /**
    * Any additional information provided by the authenticator.
    */
  var extra: StringDictionary[js.Array[String]] = js.native
  /**
    * The names of groups this user is a part of.
    */
  var groups: js.Array[String] = js.native
  /**
    * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
    */
  var uid: String = js.native
  /**
    * The name that uniquely identifies this user among all active users.
    */
  var username: String = js.native
}

object UserInfo {
  @scala.inline
  def apply(extra: StringDictionary[js.Array[String]], groups: js.Array[String], uid: String, username: String): UserInfo = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtra(value: StringDictionary[js.Array[String]]): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

