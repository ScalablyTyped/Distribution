package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

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
  def apply(email: String = null, id: Int | Double = null, name: String = null): User = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

