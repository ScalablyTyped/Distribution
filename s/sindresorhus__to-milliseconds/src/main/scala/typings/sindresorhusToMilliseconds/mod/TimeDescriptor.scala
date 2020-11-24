package typings.sindresorhusToMilliseconds.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeDescriptor extends js.Object {
  
  val days: js.UndefOr[Double] = js.native
  
  val hours: js.UndefOr[Double] = js.native
  
  val microseconds: js.UndefOr[Double] = js.native
  
  val milliseconds: js.UndefOr[Double] = js.native
  
  val minutes: js.UndefOr[Double] = js.native
  
  val nanoseconds: js.UndefOr[Double] = js.native
  
  val seconds: js.UndefOr[Double] = js.native
}
object TimeDescriptor {
  
  @scala.inline
  def apply(): TimeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDescriptor]
  }
  
  @scala.inline
  implicit class TimeDescriptorOps[Self <: TimeDescriptor] (val x: Self) extends AnyVal {
    
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
    def setMicroseconds(value: Double): Self = this.set("microseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicroseconds: Self = this.set("microseconds", js.undefined)
    
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setNanoseconds(value: Double): Self = this.set("nanoseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNanoseconds: Self = this.set("nanoseconds", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
  }
}
