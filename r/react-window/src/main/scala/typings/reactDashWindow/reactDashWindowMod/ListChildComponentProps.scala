package typings.reactDashWindow.reactDashWindowMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChildComponentProps extends js.Object {
  var data: js.Any
  var index: Double
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  var style: CSSProperties
}

object ListChildComponentProps {
  @scala.inline
  def apply(data: js.Any, index: Double, style: CSSProperties, isScrolling: js.UndefOr[Boolean] = js.undefined): ListChildComponentProps = {
    val __obj = js.Dynamic.literal(data = data, index = index, style = style)
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.asInstanceOf[ListChildComponentProps]
  }
}

