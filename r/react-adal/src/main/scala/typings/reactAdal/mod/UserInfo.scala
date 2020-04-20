package typings.reactAdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
    * Properties parsed from `id_token`.
    */
  var profile: js.Any
  /**
    * Username assigned from UPN or email.
    */
  var userName: String
}

object UserInfo {
  @scala.inline
  def apply(profile: js.Any, userName: String): UserInfo = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

