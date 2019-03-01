package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayModifiers
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] {
  var outside: js.UndefOr[scala.Boolean]
  var today: js.UndefOr[scala.Boolean]
}

object DayModifiers {
  @scala.inline
  def apply(
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] = null,
    outside: js.UndefOr[scala.Boolean] = js.undefined,
    today: js.UndefOr[scala.Boolean] = js.undefined
  ): DayModifiers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(outside)) __obj.updateDynamic("outside")(outside)
    if (!js.isUndefined(today)) __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[DayModifiers]
  }
}

