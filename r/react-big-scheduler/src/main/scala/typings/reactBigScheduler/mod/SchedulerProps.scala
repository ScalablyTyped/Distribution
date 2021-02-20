package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerProps extends StObject {
  
  def nextClick(schedulerData: SchedulerData): Unit = js.native
  
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit = js.native
  
  def onViewChange(schedulerData: SchedulerData, view: View): Unit = js.native
  
  def prevClick(schedulerData: SchedulerData): Unit = js.native
  
  var schedulerData: SchedulerData = js.native
}
object SchedulerProps {
  
  @scala.inline
  def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerProps]
  }
  
  @scala.inline
  implicit class SchedulerPropsMutableBuilder[Self <: SchedulerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextClick(value: SchedulerData => Unit): Self = StObject.set(x, "nextClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectDate(value: (SchedulerData, String) => Unit): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnViewChange(value: (SchedulerData, View) => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrevClick(value: SchedulerData => Unit): Self = StObject.set(x, "prevClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchedulerData(value: SchedulerData): Self = StObject.set(x, "schedulerData", value.asInstanceOf[js.Any])
  }
}
