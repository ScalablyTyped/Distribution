package typings
package reactDashMdLib.libHelpersResizeObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverProps extends js.Object {
  var component: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var watchHeight: js.UndefOr[scala.Boolean] = js.undefined
  var watchWidth: js.UndefOr[scala.Boolean] = js.undefined
  def onResize(nextSize: ResizeParams): scala.Unit
}

object ResizeObserverProps {
  @scala.inline
  def apply(
    onResize: js.Function1[ResizeParams, scala.Unit],
    component: java.lang.String = null,
    target: java.lang.String | js.Object = null,
    watchHeight: js.UndefOr[scala.Boolean] = js.undefined,
    watchWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): ResizeObserverProps = {
    val __obj = js.Dynamic.literal(onResize = onResize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(watchHeight)) __obj.updateDynamic("watchHeight")(watchHeight)
    if (!js.isUndefined(watchWidth)) __obj.updateDynamic("watchWidth")(watchWidth)
    __obj.asInstanceOf[ResizeObserverProps]
  }
}

