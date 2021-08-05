package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDayPhrases extends StObject {
  
  var chooseAvailableDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  
  var dateIsSelected: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  
  var dateIsSelectedAsEndDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  
  var dateIsSelectedAsStartDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
  
  var dateIsUnavailable: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.undefined
}
object CalendarDayPhrases {
  
  inline def apply(): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarDayPhrases]
  }
  
  extension [Self <: CalendarDayPhrases](x: Self) {
    
    inline def setChooseAvailableDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "chooseAvailableDate", js.Any.fromFunction1(value))
    
    inline def setChooseAvailableDateUndefined: Self = StObject.set(x, "chooseAvailableDate", js.undefined)
    
    inline def setDateIsSelected(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelected", js.Any.fromFunction1(value))
    
    inline def setDateIsSelectedAsEndDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelectedAsEndDate", js.Any.fromFunction1(value))
    
    inline def setDateIsSelectedAsEndDateUndefined: Self = StObject.set(x, "dateIsSelectedAsEndDate", js.undefined)
    
    inline def setDateIsSelectedAsStartDate(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsSelectedAsStartDate", js.Any.fromFunction1(value))
    
    inline def setDateIsSelectedAsStartDateUndefined: Self = StObject.set(x, "dateIsSelectedAsStartDate", js.undefined)
    
    inline def setDateIsSelectedUndefined: Self = StObject.set(x, "dateIsSelected", js.undefined)
    
    inline def setDateIsUnavailable(value: /* phraseArg */ PhraseArg => String): Self = StObject.set(x, "dateIsUnavailable", js.Any.fromFunction1(value))
    
    inline def setDateIsUnavailableUndefined: Self = StObject.set(x, "dateIsUnavailable", js.undefined)
  }
}
