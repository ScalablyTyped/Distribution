package typings
package reactDashFoundationLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNameProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var noDefaultClassName: js.UndefOr[java.lang.String] = js.undefined
}

object ClassNameProps {
  @scala.inline
  def apply(className: java.lang.String = null, noDefaultClassName: java.lang.String = null): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName)
    __obj.asInstanceOf[ClassNameProps]
  }
}

