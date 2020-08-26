package typings.reactBigScheduler.mod

import typings.reactBigScheduler.anon.CellUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerDataBehaviors extends js.Object {
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
  implicit class SchedulerDataBehaviorsOps[Self <: SchedulerDataBehaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCustomDateFunc(
      value: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => CellUnit
    ): Self = this.set("getCustomDateFunc", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetCustomDateFunc: Self = this.set("getCustomDateFunc", js.undefined)
    @scala.inline
    def setIsNonWorkingTimeFunc(value: (/* schedulerData */ SchedulerData, /* time */ String) => Boolean): Self = this.set("isNonWorkingTimeFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsNonWorkingTimeFunc: Self = this.set("isNonWorkingTimeFunc", js.undefined)
  }
  
}

