package typings.sequelize.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Error] = js.undefined
}

object Errors {
  @scala.inline
  def apply(errors: js.Object = null, message: String = null, parent: Error = null): Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

