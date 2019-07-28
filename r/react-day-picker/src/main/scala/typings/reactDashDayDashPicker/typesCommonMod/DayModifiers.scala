package typings.reactDashDayDashPicker.typesCommonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayModifiers
  extends /* other */ StringDictionary[js.UndefOr[Boolean]] {
  var outside: js.UndefOr[Boolean] = js.undefined
  var today: js.UndefOr[Boolean] = js.undefined
}

object DayModifiers {
  @scala.inline
  def apply(
    StringDictionary: /* other */ StringDictionary[js.UndefOr[Boolean]] = null,
    outside: js.UndefOr[Boolean] = js.undefined,
    today: js.UndefOr[Boolean] = js.undefined
  ): DayModifiers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(outside)) __obj.updateDynamic("outside")(outside)
    if (!js.isUndefined(today)) __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[DayModifiers]
  }
}

