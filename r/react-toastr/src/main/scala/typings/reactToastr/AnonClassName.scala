package typings.reactToastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var toastMessageFactory: js.Any
}

object AnonClassName {
  @scala.inline
  def apply(toastMessageFactory: js.Any, className: String = null): AnonClassName = {
    val __obj = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

