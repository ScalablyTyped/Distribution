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

