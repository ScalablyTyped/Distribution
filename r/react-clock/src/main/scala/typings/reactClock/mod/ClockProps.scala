package typings.reactClock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockProps[T] extends js.Object {
  
  /**
    * Class name(s) that will be added along with "react-clock" to the main React-Clock <time> element.
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Hour hand length, in %.
    * @default 50
    */
  var hourHandLength: js.UndefOr[Double] = js.native
  
  /**
    * The length of the part of an hour hand on the opposite side the hand is pointing to, in %.
    * @default 10
    */
  var hourHandOppositeLength: js.UndefOr[Double] = js.native
  
  /**
    * Hour hand width, in pixels.
    * @default 4
    */
  var hourHandWidth: js.UndefOr[Double] = js.native
  
  /**
    * Hour marks length, in %.
    * @default 10
    */
  var hourMarksLength: js.UndefOr[Double] = js.native
  
  /**
    * Hour marks width, in pixels.
    * @default 3
    */
  var hourMarksWidth: js.UndefOr[Double] = js.native
  
  /**
    * Minute hand length, in %.
    * @default 70
    */
  var minuteHandLength: js.UndefOr[Double] = js.native
  
  /**
    * The length of the part of a minute hand on the opposite side the hand is pointing to, in %.
    * @default 10
    */
  var minuteHandOppositeLength: js.UndefOr[Double] = js.native
  
  /**
    * Minute hand width, in pixels.
    * @default 2
    */
  var minuteHandWidth: js.UndefOr[Double] = js.native
  
  /**
    * Minute marks length, in %.
    * @default 6
    */
  var minuteMarksLength: js.UndefOr[Double] = js.native
  
  /**
    * Minute marks width, in pixels.
    * @default 1
    */
  var minuteMarksWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether hour marks shall be rendered.
    * @default true
    */
  var renderHourMarks: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether minute hand shall be rendered.
    * @default true
    */
  var renderMinuteHand: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether minute marks shall be rendered.
    * @default true
    */
  var renderMinuteMarks: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether numbers shall be rendered.
    * @default false
    */
  var renderNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether second hand shall be rendered.
    * @default true
    */
  var renderSecondHand: js.UndefOr[Boolean] = js.native
  
  /**
    * Second hand length, in %.
    * @default 90
    */
  var secondHandLength: js.UndefOr[Double] = js.native
  
  /**
    * The length of the part of a second hand on the opposite side the hand is pointing to, in %.
    * @default 10
    */
  var secondHandOppositeLength: js.UndefOr[Double] = js.native
  
  /**
    * Second hand width, in pixels.
    * @default 1
    */
  var secondHandWidth: js.UndefOr[Double] = js.native
  
  /**
    * Clock size, in pixels.
    * @default 150
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * Clock value. Must be provided.
    */
  var value: T = js.native
}
object ClockProps {
  
  @scala.inline
  def apply[T](value: T): ClockProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockProps[T]]
  }
  
  @scala.inline
  implicit class ClockPropsOps[Self <: ClockProps[_], T] (val x: Self with ClockProps[T]) extends AnyVal {
    
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
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
