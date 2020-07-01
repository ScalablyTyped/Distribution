package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait CalendarDayPhrases extends js.Object {
  var chooseAvailableDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  var dateIsSelected: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  var dateIsSelectedAsEndDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  var dateIsSelectedAsStartDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  var dateIsUnavailable: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
}

object CalendarDayPhrases {
  @scala.inline
  def apply(
    chooseAvailableDate: /* phraseArg */ PhraseArg => String = null,
    dateIsSelected: /* phraseArg */ PhraseArg => String = null,
    dateIsSelectedAsEndDate: /* phraseArg */ PhraseArg => String = null,
    dateIsSelectedAsStartDate: /* phraseArg */ PhraseArg => String = null,
    dateIsUnavailable: /* phraseArg */ PhraseArg => String = null
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal()
    if (chooseAvailableDate != null) __obj.updateDynamic("chooseAvailableDate")(js.Any.fromFunction1(chooseAvailableDate))
    if (dateIsSelected != null) __obj.updateDynamic("dateIsSelected")(js.Any.fromFunction1(dateIsSelected))
    if (dateIsSelectedAsEndDate != null) __obj.updateDynamic("dateIsSelectedAsEndDate")(js.Any.fromFunction1(dateIsSelectedAsEndDate))
    if (dateIsSelectedAsStartDate != null) __obj.updateDynamic("dateIsSelectedAsStartDate")(js.Any.fromFunction1(dateIsSelectedAsStartDate))
    if (dateIsUnavailable != null) __obj.updateDynamic("dateIsUnavailable")(js.Any.fromFunction1(dateIsUnavailable))
    __obj.asInstanceOf[CalendarDayPhrases]
  }
}

