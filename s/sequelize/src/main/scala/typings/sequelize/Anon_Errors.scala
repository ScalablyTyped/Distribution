package typings.sequelize

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Error] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Object = null, message: String = null, parent: Error = null): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Errors]
  }
}

