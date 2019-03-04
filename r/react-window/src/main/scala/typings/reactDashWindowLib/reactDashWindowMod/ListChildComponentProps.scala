package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChildComponentProps extends js.Object {
  var data: js.Any
  var index: scala.Double
  var isScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object ListChildComponentProps {
  @scala.inline
  def apply(
    data: js.Any,
    index: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties,
    isScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): ListChildComponentProps = {
    val __obj = js.Dynamic.literal(data = data, index = index, style = style)
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.asInstanceOf[ListChildComponentProps]
  }
}

