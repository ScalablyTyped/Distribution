package typings.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalRate extends js.Object {
  
  /**
    * The number of days in the interval.  Must be a positive integer.
    */
  var days: js.UndefOr[Double] = js.native
  
  /**
    * The number of hours in the interval.  Must be a positive integer.
    */
  var hours: js.UndefOr[Double] = js.native
  
  /**
    * The number of minutes in the interval.  Must be a positive integer.
    */
  var minutes: js.UndefOr[Double] = js.native
}
object IntervalRate {
  
  @scala.inline
  def apply(): IntervalRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalRate]
  }
  
  @scala.inline
  implicit class IntervalRateOps[Self <: IntervalRate] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
  }
}
