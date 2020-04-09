package typings.reactBootstrapTableNext

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltipFormatter[T /* <: js.Object */] extends js.Object {
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, Element]] = js.undefined
}

object AnonTooltipFormatter {
  @scala.inline
  def apply[T /* <: js.Object */](tooltipFormatter: /* row */ T => Element = null): AnonTooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    if (tooltipFormatter != null) __obj.updateDynamic("tooltipFormatter")(js.Any.fromFunction1(tooltipFormatter))
    __obj.asInstanceOf[AnonTooltipFormatter[T]]
  }
}

