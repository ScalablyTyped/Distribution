package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPickerNavigationPhrases extends StObject {
  
  var jumpToNextMonth: js.UndefOr[String] = js.native
  
  var jumpToPrevMonth: js.UndefOr[String] = js.native
}
object DayPickerNavigationPhrases {
  
  @scala.inline
  def apply(): DayPickerNavigationPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerNavigationPhrases]
  }
  
  @scala.inline
  implicit class DayPickerNavigationPhrasesMutableBuilder[Self <: DayPickerNavigationPhrases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJumpToNextMonth(value: String): Self = StObject.set(x, "jumpToNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpToNextMonthUndefined: Self = StObject.set(x, "jumpToNextMonth", js.undefined)
    
    @scala.inline
    def setJumpToPrevMonth(value: String): Self = StObject.set(x, "jumpToPrevMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpToPrevMonthUndefined: Self = StObject.set(x, "jumpToPrevMonth", js.undefined)
  }
}
