package typings.reactDayPicker.modifiersMod

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
    StringDictionary: /* integration */ StringDictionary[js.UndefOr[Boolean]] = null,
    outside: js.UndefOr[Boolean] = js.undefined,
    today: js.UndefOr[Boolean] = js.undefined
  ): DayModifiers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(outside)) __obj.updateDynamic("outside")(outside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(today)) __obj.updateDynamic("today")(today.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayModifiers]
  }
}

