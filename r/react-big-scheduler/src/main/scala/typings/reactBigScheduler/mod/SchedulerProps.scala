package typings.reactBigScheduler.mod

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerProps extends StObject {
  
  var eventItemClick: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* event */ Event, Unit]] = js.undefined
  
  var eventItemPopoverTemplateResolver: js.UndefOr[
    js.Function6[
      /* schedulerData */ SchedulerData, 
      /* eventItem */ Event, 
      /* title */ String, 
      /* start */ Moment, 
      /* end */ Moment, 
      /* statusColor */ String, 
      Unit
    ]
  ] = js.undefined
  
  var eventItemTemplateResolver: js.UndefOr[
    js.Function8[
      /* schedulerData */ SchedulerData, 
      /* event */ Event, 
      /* bgColor */ String, 
      /* isStart */ Boolean, 
      /* isEnd */ Boolean, 
      /* mustAddCssClass */ String, 
      /* mustBeHeight */ Double, 
      /* agendaMaxEventWidth */ Double, 
      Unit
    ]
  ] = js.undefined
  
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
    
    inline def setEventItemClick(value: (/* schedulerData */ SchedulerData, /* event */ Event) => Unit): Self = StObject.set(x, "eventItemClick", js.Any.fromFunction2(value))
    
    inline def setEventItemClickUndefined: Self = StObject.set(x, "eventItemClick", js.undefined)
    
    inline def setEventItemPopoverTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* eventItem */ Event, /* title */ String, /* start */ Moment, /* end */ Moment, /* statusColor */ String) => Unit
    ): Self = StObject.set(x, "eventItemPopoverTemplateResolver", js.Any.fromFunction6(value))
    
    inline def setEventItemPopoverTemplateResolverUndefined: Self = StObject.set(x, "eventItemPopoverTemplateResolver", js.undefined)
    
    inline def setEventItemTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* event */ Event, /* bgColor */ String, /* isStart */ Boolean, /* isEnd */ Boolean, /* mustAddCssClass */ String, /* mustBeHeight */ Double, /* agendaMaxEventWidth */ Double) => Unit
    ): Self = StObject.set(x, "eventItemTemplateResolver", js.Any.fromFunction8(value))
    
    inline def setEventItemTemplateResolverUndefined: Self = StObject.set(x, "eventItemTemplateResolver", js.undefined)
    
    inline def setNextClick(value: SchedulerData => Unit): Self = StObject.set(x, "nextClick", js.Any.fromFunction1(value))
    
    inline def setOnSelectDate(value: (SchedulerData, String) => Unit): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction2(value))
    
    inline def setOnViewChange(value: (SchedulerData, View) => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction2(value))
    
    inline def setPrevClick(value: SchedulerData => Unit): Self = StObject.set(x, "prevClick", js.Any.fromFunction1(value))
    
    inline def setSchedulerData(value: SchedulerData): Self = StObject.set(x, "schedulerData", value.asInstanceOf[js.Any])
  }
}
