package typings
package reactDashToastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var toastMessageFactory: js.Any
}

object Anon_ClassName {
  @scala.inline
  def apply(toastMessageFactory: js.Any, className: java.lang.String = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toastMessageFactory")(toastMessageFactory)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

