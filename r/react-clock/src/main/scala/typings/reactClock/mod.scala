package typings.reactClock

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-clock", JSImport.Default)
  @js.native
  def default(props: ClockProps[ClockValue]): js.Any = js.native
  
  @js.native
  trait ClockProps[T] extends StObject {
    
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
    implicit class ClockPropsMutableBuilder[Self <: ClockProps[_], T] (val x: Self with ClockProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      @scala.inline
      def setHourHandLength(value: Double): Self = StObject.set(x, "hourHandLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourHandLengthUndefined: Self = StObject.set(x, "hourHandLength", js.undefined)
      
      @scala.inline
      def setHourHandOppositeLength(value: Double): Self = StObject.set(x, "hourHandOppositeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourHandOppositeLengthUndefined: Self = StObject.set(x, "hourHandOppositeLength", js.undefined)
      
      @scala.inline
      def setHourHandWidth(value: Double): Self = StObject.set(x, "hourHandWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourHandWidthUndefined: Self = StObject.set(x, "hourHandWidth", js.undefined)
      
      @scala.inline
      def setHourMarksLength(value: Double): Self = StObject.set(x, "hourMarksLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourMarksLengthUndefined: Self = StObject.set(x, "hourMarksLength", js.undefined)
      
      @scala.inline
      def setHourMarksWidth(value: Double): Self = StObject.set(x, "hourMarksWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourMarksWidthUndefined: Self = StObject.set(x, "hourMarksWidth", js.undefined)
      
      @scala.inline
      def setMinuteHandLength(value: Double): Self = StObject.set(x, "minuteHandLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteHandLengthUndefined: Self = StObject.set(x, "minuteHandLength", js.undefined)
      
      @scala.inline
      def setMinuteHandOppositeLength(value: Double): Self = StObject.set(x, "minuteHandOppositeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteHandOppositeLengthUndefined: Self = StObject.set(x, "minuteHandOppositeLength", js.undefined)
      
      @scala.inline
      def setMinuteHandWidth(value: Double): Self = StObject.set(x, "minuteHandWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteHandWidthUndefined: Self = StObject.set(x, "minuteHandWidth", js.undefined)
      
      @scala.inline
      def setMinuteMarksLength(value: Double): Self = StObject.set(x, "minuteMarksLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteMarksLengthUndefined: Self = StObject.set(x, "minuteMarksLength", js.undefined)
      
      @scala.inline
      def setMinuteMarksWidth(value: Double): Self = StObject.set(x, "minuteMarksWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteMarksWidthUndefined: Self = StObject.set(x, "minuteMarksWidth", js.undefined)
      
      @scala.inline
      def setRenderHourMarks(value: Boolean): Self = StObject.set(x, "renderHourMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderHourMarksUndefined: Self = StObject.set(x, "renderHourMarks", js.undefined)
      
      @scala.inline
      def setRenderMinuteHand(value: Boolean): Self = StObject.set(x, "renderMinuteHand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderMinuteHandUndefined: Self = StObject.set(x, "renderMinuteHand", js.undefined)
      
      @scala.inline
      def setRenderMinuteMarks(value: Boolean): Self = StObject.set(x, "renderMinuteMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderMinuteMarksUndefined: Self = StObject.set(x, "renderMinuteMarks", js.undefined)
      
      @scala.inline
      def setRenderNumbers(value: Boolean): Self = StObject.set(x, "renderNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderNumbersUndefined: Self = StObject.set(x, "renderNumbers", js.undefined)
      
      @scala.inline
      def setRenderSecondHand(value: Boolean): Self = StObject.set(x, "renderSecondHand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderSecondHandUndefined: Self = StObject.set(x, "renderSecondHand", js.undefined)
      
      @scala.inline
      def setSecondHandLength(value: Double): Self = StObject.set(x, "secondHandLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondHandLengthUndefined: Self = StObject.set(x, "secondHandLength", js.undefined)
      
      @scala.inline
      def setSecondHandOppositeLength(value: Double): Self = StObject.set(x, "secondHandOppositeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondHandOppositeLengthUndefined: Self = StObject.set(x, "secondHandOppositeLength", js.undefined)
      
      @scala.inline
      def setSecondHandWidth(value: Double): Self = StObject.set(x, "secondHandWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondHandWidthUndefined: Self = StObject.set(x, "secondHandWidth", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ClockValue = String | Date
}
