package typings.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledTimes extends js.Object {
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
}

object DisabledTimes {
  @scala.inline
  def apply(
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* hour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => js.Array[Double] = null
  ): DisabledTimes = {
    val __obj = js.Dynamic.literal()
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    __obj.asInstanceOf[DisabledTimes]
  }
}

