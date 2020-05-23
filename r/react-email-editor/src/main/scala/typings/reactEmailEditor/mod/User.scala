package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  val email: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[Double] = js.undefined
  val name: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(email: String = null, id: js.UndefOr[Double] = js.undefined, name: String = null): User = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

