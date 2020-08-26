package typings.reactDayPicker.anon

import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-day-picker.react-day-picker/types/Modifiers.Modifiers> */
@js.native
trait PartialModifiers extends js.Object {
  var outside: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  var today: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
}

object PartialModifiers {
  @scala.inline
  def apply(): PartialModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModifiers]
  }
  @scala.inline
  implicit class PartialModifiersOps[Self <: PartialModifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutsideVarargs(value: Modifier*): Self = this.set("outside", js.Array(value :_*))
    @scala.inline
    def setOutsideFunction1(value: /* date */ Date => Boolean): Self = this.set("outside", js.Any.fromFunction1(value))
    @scala.inline
    def setOutside(value: Modifier | js.Array[Modifier]): Self = this.set("outside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutside: Self = this.set("outside", js.undefined)
    @scala.inline
    def setTodayVarargs(value: Modifier*): Self = this.set("today", js.Array(value :_*))
    @scala.inline
    def setTodayFunction1(value: /* date */ Date => Boolean): Self = this.set("today", js.Any.fromFunction1(value))
    @scala.inline
    def setToday(value: Modifier | js.Array[Modifier]): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
  }
  
}

