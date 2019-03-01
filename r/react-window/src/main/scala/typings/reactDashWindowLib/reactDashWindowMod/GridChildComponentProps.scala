package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridChildComponentProps extends js.Object {
  var columnIndex: scala.Double
  var data: js.Any
  var isScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var rowIndex: scala.Double
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object GridChildComponentProps {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    data: js.Any,
    rowIndex: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties,
    isScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): GridChildComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.updateDynamic("style")(style)
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.asInstanceOf[GridChildComponentProps]
  }
}

