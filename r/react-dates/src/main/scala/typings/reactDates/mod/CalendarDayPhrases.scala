package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDayPhrases extends StObject {
  
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
  implicit class CalendarDayPhrasesMutableBuilder[Self <: CalendarDayPhrases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChooseAvailableDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "chooseAvailableDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChooseAvailableDateUndefined: Self = StObject.set(x, "chooseAvailableDate", js.undefined)
    
    @scala.inline
    def setDateIsSelected(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateIsSelectedAsEndDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelectedAsEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateIsSelectedAsEndDateUndefined: Self = StObject.set(x, "dateIsSelectedAsEndDate", js.undefined)
    
    @scala.inline
    def setDateIsSelectedAsStartDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelectedAsStartDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateIsSelectedAsStartDateUndefined: Self = StObject.set(x, "dateIsSelectedAsStartDate", js.undefined)
    
    @scala.inline
    def setDateIsSelectedUndefined: Self = StObject.set(x, "dateIsSelected", js.undefined)
    
    @scala.inline
    def setDateIsUnavailable(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsUnavailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateIsUnavailableUndefined: Self = StObject.set(x, "dateIsUnavailable", js.undefined)
  }
}
