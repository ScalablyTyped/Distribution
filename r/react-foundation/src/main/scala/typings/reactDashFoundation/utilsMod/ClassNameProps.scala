package typings.reactDashFoundation.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNameProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var noDefaultClassName: js.UndefOr[String] = js.undefined
}

object ClassNameProps {
  @scala.inline
  def apply(className: String = null, noDefaultClassName: String = null): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameProps]
  }
}

