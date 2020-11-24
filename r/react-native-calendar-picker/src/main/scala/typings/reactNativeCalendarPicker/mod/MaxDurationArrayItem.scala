package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxDurationArrayItem extends js.Object {
  
  var date: MomentParsable = js.native
  
  var maxDuration: Double = js.native
}
object MaxDurationArrayItem {
  
  @scala.inline
  def apply(date: MomentParsable, maxDuration: Double): MaxDurationArrayItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDurationArrayItem]
  }
  
  @scala.inline
  implicit class MaxDurationArrayItemOps[Self <: MaxDurationArrayItem] (val x: Self) extends AnyVal {
    
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
    def setDateVarargs(value: (Double | String)*): Self = this.set("date", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: MomentParsable): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
  }
}
