package typings
package rocksetLib.rocksetMod

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
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

