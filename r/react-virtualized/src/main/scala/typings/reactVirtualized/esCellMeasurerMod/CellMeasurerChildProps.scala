package typings.reactVirtualized.esCellMeasurerMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerChildProps extends js.Object {
  var registerChild: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  def measure(): Unit
}

object CellMeasurerChildProps {
  @scala.inline
  def apply(measure: () => Unit, registerChild: /* element */ Element => Unit = null): CellMeasurerChildProps = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1(registerChild))
    __obj.asInstanceOf[CellMeasurerChildProps]
  }
}

