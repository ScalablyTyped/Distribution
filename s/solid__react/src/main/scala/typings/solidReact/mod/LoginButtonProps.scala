package typings.solidReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginButtonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var popup: String
}

object LoginButtonProps {
  @scala.inline
  def apply(popup: String, className: String = null): LoginButtonProps = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginButtonProps]
  }
}

