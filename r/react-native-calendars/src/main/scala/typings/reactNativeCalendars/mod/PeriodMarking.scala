package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodMarking
  extends StObject
     with Marking {
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var endingDay: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var startingDay: js.UndefOr[Boolean] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object PeriodMarking {
  
  @scala.inline
  def apply(): PeriodMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodMarking]
  }
  
  @scala.inline
  implicit class PeriodMarkingMutableBuilder[Self <: PeriodMarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEndingDay(value: Boolean): Self = StObject.set(x, "endingDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingDayUndefined: Self = StObject.set(x, "endingDay", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStartingDay(value: Boolean): Self = StObject.set(x, "startingDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingDayUndefined: Self = StObject.set(x, "startingDay", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
