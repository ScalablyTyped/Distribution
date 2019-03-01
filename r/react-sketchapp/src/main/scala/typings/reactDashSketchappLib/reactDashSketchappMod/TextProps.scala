package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var children: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[TextStyle | StyleReference] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    children: java.lang.String = null,
    name: java.lang.String = null,
    style: TextStyle | StyleReference = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (name != null) __obj.updateDynamic("name")(name)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

