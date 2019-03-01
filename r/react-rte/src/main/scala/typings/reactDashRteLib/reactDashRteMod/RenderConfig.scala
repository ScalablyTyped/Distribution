package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderConfig extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object RenderConfig {
  @scala.inline
  def apply(attributes: js.Any = null, element: java.lang.String = null, style: js.Any = null): RenderConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (element != null) __obj.updateDynamic("element")(element)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RenderConfig]
  }
}

