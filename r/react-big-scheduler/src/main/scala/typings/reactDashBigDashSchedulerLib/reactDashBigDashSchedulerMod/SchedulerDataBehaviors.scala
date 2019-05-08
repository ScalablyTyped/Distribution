package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDataBehaviors extends js.Object {
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ scala.Double, 
      /* date */ js.UndefOr[java.lang.String], 
      reactDashBigDashSchedulerLib.Anon_CellUnit
    ]
  ] = js.undefined
  var isNonWorkingTimeFunc: js.UndefOr[
    js.Function2[/* schedulerData */ SchedulerData, /* time */ java.lang.String, scala.Boolean]
  ] = js.undefined
}

object SchedulerDataBehaviors {
  @scala.inline
  def apply(
    getCustomDateFunc: (/* schedulerData */ SchedulerData, /* num */ scala.Double, /* date */ js.UndefOr[java.lang.String]) => reactDashBigDashSchedulerLib.Anon_CellUnit = null,
    isNonWorkingTimeFunc: (/* schedulerData */ SchedulerData, /* time */ java.lang.String) => scala.Boolean = null
  ): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    if (getCustomDateFunc != null) __obj.updateDynamic("getCustomDateFunc")(js.Any.fromFunction3(getCustomDateFunc))
    if (isNonWorkingTimeFunc != null) __obj.updateDynamic("isNonWorkingTimeFunc")(js.Any.fromFunction2(isNonWorkingTimeFunc))
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
}

