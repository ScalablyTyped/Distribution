package typings.reactBigScheduler.mod

import typings.reactBigScheduler.anon.CellUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerDataBehaviors extends StObject {
  
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ Double, 
      /* date */ js.UndefOr[String], 
      CellUnit
    ]
  ] = js.native
  
  var isNonWorkingTimeFunc: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* time */ String, Boolean]] = js.native
}
object SchedulerDataBehaviors {
  
  @scala.inline
  def apply(): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
  
  @scala.inline
  implicit class SchedulerDataBehaviorsMutableBuilder[Self <: SchedulerDataBehaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCustomDateFunc(
      value: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => CellUnit
    ): Self = StObject.set(x, "getCustomDateFunc", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCustomDateFuncUndefined: Self = StObject.set(x, "getCustomDateFunc", js.undefined)
    
    @scala.inline
    def setIsNonWorkingTimeFunc(value: (/* schedulerData */ SchedulerData, /* time */ String) => Boolean): Self = StObject.set(x, "isNonWorkingTimeFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsNonWorkingTimeFuncUndefined: Self = StObject.set(x, "isNonWorkingTimeFunc", js.undefined)
  }
}
