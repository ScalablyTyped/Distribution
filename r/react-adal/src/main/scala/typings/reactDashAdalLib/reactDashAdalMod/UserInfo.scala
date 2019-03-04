package typings
package reactDashAdalLib.reactDashAdalMod

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
  var userName: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(profile: js.Any, userName: java.lang.String): UserInfo = {
    val __obj = js.Dynamic.literal(profile = profile, userName = userName)
  
    __obj.asInstanceOf[UserInfo]
  }
}

