package typings.reactTimePicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-clock.react-clock.ClockProps<react-clock.react-clock.ClockValue>, 'value' | 'className'> */
@js.native
trait TimePickerClockProps extends js.Object {
  
  var hourHandLength: js.UndefOr[Double] = js.native
  
  var hourHandOppositeLength: js.UndefOr[Double] = js.native
  
  var hourHandWidth: js.UndefOr[Double] = js.native
  
  var hourMarksLength: js.UndefOr[Double] = js.native
  
  var hourMarksWidth: js.UndefOr[Double] = js.native
  
  var minuteHandLength: js.UndefOr[Double] = js.native
  
  var minuteHandOppositeLength: js.UndefOr[Double] = js.native
  
  var minuteHandWidth: js.UndefOr[Double] = js.native
  
  var minuteMarksLength: js.UndefOr[Double] = js.native
  
  var minuteMarksWidth: js.UndefOr[Double] = js.native
  
  var renderHourMarks: js.UndefOr[Boolean] = js.native
  
  var renderMinuteHand: js.UndefOr[Boolean] = js.native
  
  var renderMinuteMarks: js.UndefOr[Boolean] = js.native
  
  var renderNumbers: js.UndefOr[Boolean] = js.native
  
  var renderSecondHand: js.UndefOr[Boolean] = js.native
  
  var secondHandLength: js.UndefOr[Double] = js.native
  
  var secondHandOppositeLength: js.UndefOr[Double] = js.native
  
  var secondHandWidth: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object TimePickerClockProps {
  
  @scala.inline
  def apply(): TimePickerClockProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerClockProps]
  }
  
  @scala.inline
  implicit class TimePickerClockPropsOps[Self <: TimePickerClockProps] (val x: Self) extends AnyVal {
    
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
    def setHourHandLength(value: Double): Self = this.set("hourHandLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourHandLength: Self = this.set("hourHandLength", js.undefined)
    
    @scala.inline
    def setHourHandOppositeLength(value: Double): Self = this.set("hourHandOppositeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourHandOppositeLength: Self = this.set("hourHandOppositeLength", js.undefined)
    
    @scala.inline
    def setHourHandWidth(value: Double): Self = this.set("hourHandWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourHandWidth: Self = this.set("hourHandWidth", js.undefined)
    
    @scala.inline
    def setHourMarksLength(value: Double): Self = this.set("hourMarksLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourMarksLength: Self = this.set("hourMarksLength", js.undefined)
    
    @scala.inline
    def setHourMarksWidth(value: Double): Self = this.set("hourMarksWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourMarksWidth: Self = this.set("hourMarksWidth", js.undefined)
    
    @scala.inline
    def setMinuteHandLength(value: Double): Self = this.set("minuteHandLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteHandLength: Self = this.set("minuteHandLength", js.undefined)
    
    @scala.inline
    def setMinuteHandOppositeLength(value: Double): Self = this.set("minuteHandOppositeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteHandOppositeLength: Self = this.set("minuteHandOppositeLength", js.undefined)
    
    @scala.inline
    def setMinuteHandWidth(value: Double): Self = this.set("minuteHandWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteHandWidth: Self = this.set("minuteHandWidth", js.undefined)
    
    @scala.inline
    def setMinuteMarksLength(value: Double): Self = this.set("minuteMarksLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteMarksLength: Self = this.set("minuteMarksLength", js.undefined)
    
    @scala.inline
    def setMinuteMarksWidth(value: Double): Self = this.set("minuteMarksWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteMarksWidth: Self = this.set("minuteMarksWidth", js.undefined)
    
    @scala.inline
    def setRenderHourMarks(value: Boolean): Self = this.set("renderHourMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderHourMarks: Self = this.set("renderHourMarks", js.undefined)
    
    @scala.inline
    def setRenderMinuteHand(value: Boolean): Self = this.set("renderMinuteHand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMinuteHand: Self = this.set("renderMinuteHand", js.undefined)
    
    @scala.inline
    def setRenderMinuteMarks(value: Boolean): Self = this.set("renderMinuteMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMinuteMarks: Self = this.set("renderMinuteMarks", js.undefined)
    
    @scala.inline
    def setRenderNumbers(value: Boolean): Self = this.set("renderNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderNumbers: Self = this.set("renderNumbers", js.undefined)
    
    @scala.inline
    def setRenderSecondHand(value: Boolean): Self = this.set("renderSecondHand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderSecondHand: Self = this.set("renderSecondHand", js.undefined)
    
    @scala.inline
    def setSecondHandLength(value: Double): Self = this.set("secondHandLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondHandLength: Self = this.set("secondHandLength", js.undefined)
    
    @scala.inline
    def setSecondHandOppositeLength(value: Double): Self = this.set("secondHandOppositeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondHandOppositeLength: Self = this.set("secondHandOppositeLength", js.undefined)
    
    @scala.inline
    def setSecondHandWidth(value: Double): Self = this.set("secondHandWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondHandWidth: Self = this.set("secondHandWidth", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
