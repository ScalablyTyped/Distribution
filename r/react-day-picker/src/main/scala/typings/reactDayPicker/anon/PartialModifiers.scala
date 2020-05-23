package typings.reactDayPicker.anon

import typings.reactDayPicker.modifiersMod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-day-picker.react-day-picker/types/Modifiers.Modifiers> */
trait PartialModifiers extends js.Object {
  var outside: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  var today: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
}

object PartialModifiers {
  @scala.inline
  def apply(outside: Modifier | js.Array[Modifier] = null, today: Modifier | js.Array[Modifier] = null): PartialModifiers = {
    val __obj = js.Dynamic.literal()
    if (outside != null) __obj.updateDynamic("outside")(outside.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialModifiers]
  }
}

