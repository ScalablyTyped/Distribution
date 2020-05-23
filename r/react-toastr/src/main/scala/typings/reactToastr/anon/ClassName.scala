package typings.reactToastr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var toastMessageFactory: js.Any
}

object ClassName {
  @scala.inline
  def apply(toastMessageFactory: js.Any, className: String = null): ClassName = {
    val __obj = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

