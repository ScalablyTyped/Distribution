package typings.atPulumiKubernetes.typesOutputMod.authentication.v1

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
  val extra: js.Object
  /**
    * The names of groups this user is a part of.
    */
  val groups: js.Array[String]
  /**
    * A unique value that identifies this user across time. If this user is deleted and another
    * user by the same name is added, they will have different UIDs.
    */
  val uid: String
  /**
    * The name that uniquely identifies this user among all active users.
    */
  val username: String
}

object UserInfo {
  @scala.inline
  def apply(extra: js.Object, groups: js.Array[String], uid: String, username: String): UserInfo = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo]
  }
}

