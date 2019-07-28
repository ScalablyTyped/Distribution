package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  // list of users
  var data: js.UndefOr[js.Array[User]] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(data: js.Array[User] = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

