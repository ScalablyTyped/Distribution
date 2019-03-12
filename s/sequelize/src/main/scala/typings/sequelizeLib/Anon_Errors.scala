package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[stdLib.Error] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Object = null, message: java.lang.String = null, parent: stdLib.Error = null): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Errors]
  }
}

