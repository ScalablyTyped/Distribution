package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserResponse extends js.Object {
  // user object that was deleted
  var data: js.UndefOr[User] = js.undefined
}

object DeleteUserResponse {
  @scala.inline
  def apply(data: User = null): DeleteUserResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[DeleteUserResponse]
  }
}

