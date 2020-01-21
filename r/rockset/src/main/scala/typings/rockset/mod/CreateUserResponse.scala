package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  // user that was created
  var data: js.UndefOr[User] = js.undefined
}

object CreateUserResponse {
  @scala.inline
  def apply(data: User = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
}

