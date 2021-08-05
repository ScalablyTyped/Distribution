package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerProps extends StObject {
  
  def nextClick(schedulerData: SchedulerData): Unit
  
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit
  
  def onViewChange(schedulerData: SchedulerData, view: View): Unit
  
  def prevClick(schedulerData: SchedulerData): Unit
  
  var schedulerData: SchedulerData
}
object SchedulerProps {
  
  inline def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerProps]
  }
  
  extension [Self <: SchedulerProps](x: Self) {
    
    inline def setNextClick(value: SchedulerData => Unit): Self = StObject.set(x, "nextClick", js.Any.fromFunction1(value))
    
    inline def setOnSelectDate(value: (SchedulerData, String) => Unit): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction2(value))
    
    inline def setOnViewChange(value: (SchedulerData, View) => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction2(value))
    
    inline def setPrevClick(value: SchedulerData => Unit): Self = StObject.set(x, "prevClick", js.Any.fromFunction1(value))
    
    inline def setSchedulerData(value: SchedulerData): Self = StObject.set(x, "schedulerData", value.asInstanceOf[js.Any])
  }
}
