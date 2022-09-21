package typings.reactClock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-clock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ClockProps[ClockValue]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ClockProps[T] extends StObject {
    
    /**
      * Class name(s) that will be added along with "react-clock" to the main React-Clock <time> element.
      */
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Hour hand length, in %.
      * @default 50
      */
    var hourHandLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The length of the part of an hour hand on the opposite side the hand is pointing to, in %.
      * @default 10
      */
    var hourHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Hour hand width, in pixels.
      * @default 4
      */
    var hourHandWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Hour marks length, in %.
      * @default 10
      */
    var hourMarksLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Hour marks width, in pixels.
      * @default 3
      */
    var hourMarksWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Minute hand length, in %.
      * @default 70
      */
    var minuteHandLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The length of the part of a minute hand on the opposite side the hand is pointing to, in %.
      * @default 10
      */
    var minuteHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Minute hand width, in pixels.
      * @default 2
      */
    var minuteHandWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Minute marks length, in %.
      * @default 6
      */
    var minuteMarksLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Minute marks width, in pixels.
      * @default 1
      */
    var minuteMarksWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether hour marks shall be rendered.
      * @default true
      */
    var renderHourMarks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether minute hand shall be rendered.
      * @default true
      */
    var renderMinuteHand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether minute marks shall be rendered.
      * @default true
      */
    var renderMinuteMarks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether numbers shall be rendered.
      * @default false
      */
    var renderNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether second hand shall be rendered.
      * @default true
      */
    var renderSecondHand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Second hand length, in %.
      * @default 90
      */
    var secondHandLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The length of the part of a second hand on the opposite side the hand is pointing to, in %.
      * @default 10
      */
    var secondHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Second hand width, in pixels.
      * @default 1
      */
    var secondHandWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Clock size, in pixels.
      * @default 150
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Clock value. Must be provided.
      */
    var value: T
  }
  object ClockProps {
    
    inline def apply[T](value: T): ClockProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClockProps[T]]
    }
    
    extension [Self <: ClockProps[?], T](x: Self & ClockProps[T]) {
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setHourHandLength(value: Double): Self = StObject.set(x, "hourHandLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandLengthUndefined: Self = StObject.set(x, "hourHandLength", js.undefined)
      
      inline def setHourHandOppositeLength(value: Double): Self = StObject.set(x, "hourHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandOppositeLengthUndefined: Self = StObject.set(x, "hourHandOppositeLength", js.undefined)
      
      inline def setHourHandWidth(value: Double): Self = StObject.set(x, "hourHandWidth", value.asInstanceOf[js.Any])
      
      inline def setHourHandWidthUndefined: Self = StObject.set(x, "hourHandWidth", js.undefined)
      
      inline def setHourMarksLength(value: Double): Self = StObject.set(x, "hourMarksLength", value.asInstanceOf[js.Any])
      
      inline def setHourMarksLengthUndefined: Self = StObject.set(x, "hourMarksLength", js.undefined)
      
      inline def setHourMarksWidth(value: Double): Self = StObject.set(x, "hourMarksWidth", value.asInstanceOf[js.Any])
      
      inline def setHourMarksWidthUndefined: Self = StObject.set(x, "hourMarksWidth", js.undefined)
      
      inline def setMinuteHandLength(value: Double): Self = StObject.set(x, "minuteHandLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandLengthUndefined: Self = StObject.set(x, "minuteHandLength", js.undefined)
      
      inline def setMinuteHandOppositeLength(value: Double): Self = StObject.set(x, "minuteHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandOppositeLengthUndefined: Self = StObject.set(x, "minuteHandOppositeLength", js.undefined)
      
      inline def setMinuteHandWidth(value: Double): Self = StObject.set(x, "minuteHandWidth", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandWidthUndefined: Self = StObject.set(x, "minuteHandWidth", js.undefined)
      
      inline def setMinuteMarksLength(value: Double): Self = StObject.set(x, "minuteMarksLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteMarksLengthUndefined: Self = StObject.set(x, "minuteMarksLength", js.undefined)
      
      inline def setMinuteMarksWidth(value: Double): Self = StObject.set(x, "minuteMarksWidth", value.asInstanceOf[js.Any])
      
      inline def setMinuteMarksWidthUndefined: Self = StObject.set(x, "minuteMarksWidth", js.undefined)
      
      inline def setRenderHourMarks(value: Boolean): Self = StObject.set(x, "renderHourMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderHourMarksUndefined: Self = StObject.set(x, "renderHourMarks", js.undefined)
      
      inline def setRenderMinuteHand(value: Boolean): Self = StObject.set(x, "renderMinuteHand", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteHandUndefined: Self = StObject.set(x, "renderMinuteHand", js.undefined)
      
      inline def setRenderMinuteMarks(value: Boolean): Self = StObject.set(x, "renderMinuteMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteMarksUndefined: Self = StObject.set(x, "renderMinuteMarks", js.undefined)
      
      inline def setRenderNumbers(value: Boolean): Self = StObject.set(x, "renderNumbers", value.asInstanceOf[js.Any])
      
      inline def setRenderNumbersUndefined: Self = StObject.set(x, "renderNumbers", js.undefined)
      
      inline def setRenderSecondHand(value: Boolean): Self = StObject.set(x, "renderSecondHand", value.asInstanceOf[js.Any])
      
      inline def setRenderSecondHandUndefined: Self = StObject.set(x, "renderSecondHand", js.undefined)
      
      inline def setSecondHandLength(value: Double): Self = StObject.set(x, "secondHandLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandLengthUndefined: Self = StObject.set(x, "secondHandLength", js.undefined)
      
      inline def setSecondHandOppositeLength(value: Double): Self = StObject.set(x, "secondHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandOppositeLengthUndefined: Self = StObject.set(x, "secondHandOppositeLength", js.undefined)
      
      inline def setSecondHandWidth(value: Double): Self = StObject.set(x, "secondHandWidth", value.asInstanceOf[js.Any])
      
      inline def setSecondHandWidthUndefined: Self = StObject.set(x, "secondHandWidth", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ClockValue = String | js.Date
}
