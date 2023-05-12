package typings.reactClock

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.reactClock.distCjsClockMod.ClockProps
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(param0: ClockProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock", "default.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.formatHour")
      @js.native
      def formatHour: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatHour_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatHour")(x.asInstanceOf[js.Any])
      
      inline def hourHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def hourHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "default.propTypes.hourHandWidth")
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
      
      @JSImport("react-clock", "default.propTypes.hourMarksWidth")
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
      
      @JSImport("react-clock", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      inline def minuteHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def minuteHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "default.propTypes.minuteHandWidth")
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
      
      @JSImport("react-clock", "default.propTypes.minuteMarksWidth")
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
      
      @JSImport("react-clock", "default.propTypes.renderHourMarks")
      @js.native
      def renderHourMarks: Requireable[Boolean] = js.native
      inline def renderHourMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderHourMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.renderMinuteHand")
      @js.native
      def renderMinuteHand: Requireable[Boolean] = js.native
      inline def renderMinuteHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteHand")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.renderMinuteMarks")
      @js.native
      def renderMinuteMarks: Requireable[Boolean] = js.native
      inline def renderMinuteMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.renderNumbers")
      @js.native
      def renderNumbers: Requireable[Boolean] = js.native
      inline def renderNumbers_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.renderSecondHand")
      @js.native
      def renderSecondHand: Requireable[Boolean] = js.native
      inline def renderSecondHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSecondHand")(x.asInstanceOf[js.Any])
      
      inline def secondHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def secondHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "default.propTypes.secondHandWidth")
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
      
      @JSImport("react-clock", "default.propTypes.size")
      @js.native
      def size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]] = js.native
      inline def size_=(x: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  object Clock {
    
    inline def apply(param0: ClockProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock", "Clock")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock", "Clock.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock", "Clock.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.formatHour")
      @js.native
      def formatHour: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatHour_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatHour")(x.asInstanceOf[js.Any])
      
      inline def hourHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def hourHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("hourHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "Clock.propTypes.hourHandWidth")
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
      
      @JSImport("react-clock", "Clock.propTypes.hourMarksWidth")
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
      
      @JSImport("react-clock", "Clock.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      inline def minuteHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def minuteHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minuteHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "Clock.propTypes.minuteHandWidth")
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
      
      @JSImport("react-clock", "Clock.propTypes.minuteMarksWidth")
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
      
      @JSImport("react-clock", "Clock.propTypes.renderHourMarks")
      @js.native
      def renderHourMarks: Requireable[Boolean] = js.native
      inline def renderHourMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderHourMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.renderMinuteHand")
      @js.native
      def renderMinuteHand: Requireable[Boolean] = js.native
      inline def renderMinuteHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteHand")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.renderMinuteMarks")
      @js.native
      def renderMinuteMarks: Requireable[Boolean] = js.native
      inline def renderMinuteMarks_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderMinuteMarks")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.renderNumbers")
      @js.native
      def renderNumbers: Requireable[Boolean] = js.native
      inline def renderNumbers_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.renderSecondHand")
      @js.native
      def renderSecondHand: Requireable[Boolean] = js.native
      inline def renderSecondHand_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSecondHand")(x.asInstanceOf[js.Any])
      
      inline def secondHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      inline def secondHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("secondHandOppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock", "Clock.propTypes.secondHandWidth")
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
      
      @JSImport("react-clock", "Clock.propTypes.size")
      @js.native
      def size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]] = js.native
      inline def size_=(x: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock", "Clock.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
}
