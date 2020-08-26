package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait CalendarDayPhrases extends js.Object {
  var chooseAvailableDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsSelected: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsSelectedAsEndDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsSelectedAsStartDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsUnavailable: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
}

object CalendarDayPhrases {
  @scala.inline
  def apply(): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarDayPhrases]
  }
  @scala.inline
  implicit class CalendarDayPhrasesOps[Self <: CalendarDayPhrases] (val x: Self) extends AnyVal {
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
    def setChooseAvailableDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("chooseAvailableDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChooseAvailableDate: Self = this.set("chooseAvailableDate", js.undefined)
    @scala.inline
    def setDateIsSelected(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelected: Self = this.set("dateIsSelected", js.undefined)
    @scala.inline
    def setDateIsSelectedAsEndDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelectedAsEndDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelectedAsEndDate: Self = this.set("dateIsSelectedAsEndDate", js.undefined)
    @scala.inline
    def setDateIsSelectedAsStartDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelectedAsStartDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelectedAsStartDate: Self = this.set("dateIsSelectedAsStartDate", js.undefined)
    @scala.inline
    def setDateIsUnavailable(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsUnavailable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsUnavailable: Self = this.set("dateIsUnavailable", js.undefined)
  }
  
}

