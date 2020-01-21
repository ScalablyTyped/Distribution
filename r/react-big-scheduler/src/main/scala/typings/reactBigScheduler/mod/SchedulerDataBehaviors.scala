package typings.reactBigScheduler.mod

import typings.reactBigScheduler.AnonCellUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDataBehaviors extends js.Object {
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ Double, 
      /* date */ js.UndefOr[String], 
      AnonCellUnit
    ]
  ] = js.undefined
  var isNonWorkingTimeFunc: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* time */ String, Boolean]] = js.undefined
}

object SchedulerDataBehaviors {
  @scala.inline
  def apply(
    getCustomDateFunc: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => AnonCellUnit = null,
    isNonWorkingTimeFunc: (/* schedulerData */ SchedulerData, /* time */ String) => Boolean = null
  ): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    if (getCustomDateFunc != null) __obj.updateDynamic("getCustomDateFunc")(js.Any.fromFunction3(getCustomDateFunc))
    if (isNonWorkingTimeFunc != null) __obj.updateDynamic("isNonWorkingTimeFunc")(js.Any.fromFunction2(isNonWorkingTimeFunc))
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
}

