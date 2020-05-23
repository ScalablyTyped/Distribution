package typings.reactBootstrapTableNext.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipFormatter[T /* <: js.Object */] extends js.Object {
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, Element]] = js.undefined
}

object TooltipFormatter {
  @scala.inline
  def apply[T](tooltipFormatter: /* row */ T => Element = null): TooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    if (tooltipFormatter != null) __obj.updateDynamic("tooltipFormatter")(js.Any.fromFunction1(tooltipFormatter))
    __obj.asInstanceOf[TooltipFormatter[T]]
  }
}

