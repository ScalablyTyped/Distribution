package typings.reactWindow.mod

import typings.react.mod.CSSProperties
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChildComponentProps]
  }
}

