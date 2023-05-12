package typings.reactClock

import typings.csstype.mod.Property.Width
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.reactClock.distCjsSharedTypesMod.ClassName
import typings.reactClock.distCjsSharedTypesMod.HandLength
import typings.reactClock.distCjsSharedTypesMod.HandWidth
import typings.reactClock.distCjsSharedTypesMod.MarkLength
import typings.reactClock.distCjsSharedTypesMod.MarkWidth
import typings.reactClock.distCjsSharedTypesMod.OppositeHandLength
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsClockMod {
  
  object default {
    
    inline def apply(param0: ClockProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock/dist/cjs/Clock", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.formatHour")
      @js.native
      def formatHour: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatHour_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatHour")(x.asInstanceOf[js.Any])
      
      inline def hourHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def hourHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.hourHandWidth")
      @js.native
      def hourHandWidth: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def hourHandWidth_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourHandWidth")(x.asInstanceOf[js.Any])
      
      inline def hourMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourMarksLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.hourMarksWidth")
      @js.native
      def hourMarksWidth: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def hourMarksWidth_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourMarksWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      inline def minuteHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def minuteHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.minuteHandWidth")
      @js.native
      def minuteHandWidth: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minuteHandWidth_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteHandWidth")(x.asInstanceOf[js.Any])
      
      inline def minuteMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteMarksLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.minuteMarksWidth")
      @js.native
      def minuteMarksWidth: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minuteMarksWidth_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteMarksWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.renderHourMarks")
      @js.native
      def renderHourMarks: Requireable[Boolean] = js.native
      inline def renderHourMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderHourMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.renderMinuteHand")
      @js.native
      def renderMinuteHand: Requireable[Boolean] = js.native
      inline def renderMinuteHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteHand")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.renderMinuteMarks")
      @js.native
      def renderMinuteMarks: Requireable[Boolean] = js.native
      inline def renderMinuteMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.renderNumbers")
      @js.native
      def renderNumbers: Requireable[Boolean] = js.native
      inline def renderNumbers_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.renderSecondHand")
      @js.native
      def renderSecondHand: Requireable[Boolean] = js.native
      inline def renderSecondHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSecondHand")(x.asInstanceOf[js.Any])
      
      inline def secondHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def secondHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.secondHandWidth")
      @js.native
      def secondHandWidth: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def secondHandWidth_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondHandWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.size")
      @js.native
      def size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]] = js.native
      inline def size_=(x: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Clock", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  trait ClockProps extends StObject {
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var formatHour: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* hour */ Double, String]] = js.undefined
    
    var hourHandLength: js.UndefOr[HandLength] = js.undefined
    
    var hourHandOppositeLength: js.UndefOr[OppositeHandLength] = js.undefined
    
    var hourHandWidth: js.UndefOr[HandWidth] = js.undefined
    
    var hourMarksLength: js.UndefOr[MarkLength] = js.undefined
    
    var hourMarksWidth: js.UndefOr[MarkWidth] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var minuteHandLength: js.UndefOr[HandLength] = js.undefined
    
    var minuteHandOppositeLength: js.UndefOr[OppositeHandLength] = js.undefined
    
    var minuteHandWidth: js.UndefOr[HandWidth] = js.undefined
    
    var minuteMarksLength: js.UndefOr[MarkLength] = js.undefined
    
    var minuteMarksWidth: js.UndefOr[MarkWidth] = js.undefined
    
    var renderHourMarks: js.UndefOr[Boolean] = js.undefined
    
    var renderMinuteHand: js.UndefOr[Boolean] = js.undefined
    
    var renderMinuteMarks: js.UndefOr[Boolean] = js.undefined
    
    var renderNumbers: js.UndefOr[Boolean] = js.undefined
    
    var renderSecondHand: js.UndefOr[Boolean] = js.undefined
    
    var secondHandLength: js.UndefOr[HandLength] = js.undefined
    
    var secondHandOppositeLength: js.UndefOr[OppositeHandLength] = js.undefined
    
    var secondHandWidth: js.UndefOr[HandWidth] = js.undefined
    
    var size: js.UndefOr[Width[String | Double]] = js.undefined
    
    var value: js.UndefOr[String | js.Date | Null] = js.undefined
  }
  object ClockProps {
    
    inline def apply(): ClockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClockProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setFormatHour(value: (/* locale */ js.UndefOr[String], /* hour */ Double) => String): Self = StObject.set(x, "formatHour", js.Any.fromFunction2(value))
      
      inline def setFormatHourUndefined: Self = StObject.set(x, "formatHour", js.undefined)
      
      inline def setHourHandLength(value: HandLength): Self = StObject.set(x, "hourHandLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandLengthUndefined: Self = StObject.set(x, "hourHandLength", js.undefined)
      
      inline def setHourHandOppositeLength(value: OppositeHandLength): Self = StObject.set(x, "hourHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandOppositeLengthUndefined: Self = StObject.set(x, "hourHandOppositeLength", js.undefined)
      
      inline def setHourHandWidth(value: HandWidth): Self = StObject.set(x, "hourHandWidth", value.asInstanceOf[js.Any])
      
      inline def setHourHandWidthUndefined: Self = StObject.set(x, "hourHandWidth", js.undefined)
      
      inline def setHourMarksLength(value: MarkLength): Self = StObject.set(x, "hourMarksLength", value.asInstanceOf[js.Any])
      
      inline def setHourMarksLengthUndefined: Self = StObject.set(x, "hourMarksLength", js.undefined)
      
      inline def setHourMarksWidth(value: MarkWidth): Self = StObject.set(x, "hourMarksWidth", value.asInstanceOf[js.Any])
      
      inline def setHourMarksWidthUndefined: Self = StObject.set(x, "hourMarksWidth", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMinuteHandLength(value: HandLength): Self = StObject.set(x, "minuteHandLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandLengthUndefined: Self = StObject.set(x, "minuteHandLength", js.undefined)
      
      inline def setMinuteHandOppositeLength(value: OppositeHandLength): Self = StObject.set(x, "minuteHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandOppositeLengthUndefined: Self = StObject.set(x, "minuteHandOppositeLength", js.undefined)
      
      inline def setMinuteHandWidth(value: HandWidth): Self = StObject.set(x, "minuteHandWidth", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandWidthUndefined: Self = StObject.set(x, "minuteHandWidth", js.undefined)
      
      inline def setMinuteMarksLength(value: MarkLength): Self = StObject.set(x, "minuteMarksLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteMarksLengthUndefined: Self = StObject.set(x, "minuteMarksLength", js.undefined)
      
      inline def setMinuteMarksWidth(value: MarkWidth): Self = StObject.set(x, "minuteMarksWidth", value.asInstanceOf[js.Any])
      
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
      
      inline def setSecondHandLength(value: HandLength): Self = StObject.set(x, "secondHandLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandLengthUndefined: Self = StObject.set(x, "secondHandLength", js.undefined)
      
      inline def setSecondHandOppositeLength(value: OppositeHandLength): Self = StObject.set(x, "secondHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandOppositeLengthUndefined: Self = StObject.set(x, "secondHandOppositeLength", js.undefined)
      
      inline def setSecondHandWidth(value: HandWidth): Self = StObject.set(x, "secondHandWidth", value.asInstanceOf[js.Any])
      
      inline def setSecondHandWidthUndefined: Self = StObject.set(x, "secondHandWidth", js.undefined)
      
      inline def setSize(value: Width[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
