package typings.reactCountup

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.reactCountup.anon.PauseResume
import typings.reactCountup.anon.PauseResumeReset
import typings.reactCountup.anon.Reset
import typings.reactCountup.anon.Start
import typings.reactCountup.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends PureComponent[Props, js.Object, js.Any]
  
  trait Props extends StObject {
    
    var children: js.UndefOr[js.Function1[/* data */ RenderProps, ReactElement]] = js.undefined
    
    /**
      * CSS class name of the span element.
      * Note: This won't be applied when using CountUp with render props.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies decimal character.
      * Default: .
      */
    var decimal: js.UndefOr[String] = js.undefined
    
    /**
      * Amount of decimals to display.
      * Default: 0
      */
    var decimals: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in seconds before starting the transition.
      * Default: null
      * Note: delay={0} will automatically start the count up.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration in seconds.
      * Default: 2
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Easing function. http://robertpenner.com/easing for more details.
      * Default: easeInExpo
      */
    var easingFn: js.UndefOr[
        js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Unit]
      ] = js.undefined
    
    /**
      * Target value.
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to customize the formatting of the number
      */
    var formattingFn: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
    
    /**
      * Callback function on transition end.
      */
    var onEnd: js.UndefOr[js.Function1[/* providedFn */ PauseResume, Unit]] = js.undefined
    
    /**
      * Callback function on pause or resume.
      */
    var onPauseResume: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Start, Unit]]] = js.undefined
    
    /**
      * Callback function on reset.
      */
    var onReset: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Update, Unit]]] = js.undefined
    
    /**
      * Callback function on transition start.
      */
    var onStart: js.UndefOr[js.Function1[/* providedFn */ Reset, Unit]] = js.undefined
    
    /**
      * Callback function on update.
      */
    var onUpdate: js.UndefOr[js.Function1[/* providedFn */ PauseResumeReset, Unit]] = js.undefined
    
    /**
      * Static text before the transitioning value.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Save previously ended number to start every new animation from it.
      * Default: false
      */
    var preserveValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces count up transition on every component update.
      * Default: false
      */
    var redraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies character of thousands separator.
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Initial value.
      * Default: 0
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /**
      * Use for start counter on mount for hook usage.
      * Default: true
      */
    var startOnMount: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Static text after the transitioning value.
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * Enables easing. Set to false for a linear transition.
      * Default: true
      */
    var useEasing: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* data */ RenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit): Self = StObject.set(x, "easingFn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEasingFnUndefined: Self = StObject.set(x, "easingFn", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFormattingFn(value: /* value */ Double => String): Self = StObject.set(x, "formattingFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormattingFnUndefined: Self = StObject.set(x, "formattingFn", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* providedFn */ PauseResume => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnPauseResume(value: () => js.Function1[/* providedFn */ Start, Unit]): Self = StObject.set(x, "onPauseResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPauseResumeUndefined: Self = StObject.set(x, "onPauseResume", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => js.Function1[/* providedFn */ Update, Unit]): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* providedFn */ Reset => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* providedFn */ PauseResumeReset => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreserveValue(value: Boolean): Self = StObject.set(x, "preserveValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveValueUndefined: Self = StObject.set(x, "preserveValue", js.undefined)
      
      @scala.inline
      def setRedraw(value: Boolean): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOnMount(value: Boolean): Self = StObject.set(x, "startOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOnMountUndefined: Self = StObject.set(x, "startOnMount", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUseEasing(value: Boolean): Self = StObject.set(x, "useEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEasingUndefined: Self = StObject.set(x, "useEasing", js.undefined)
    }
  }
  
  type ReactCountUp = PureComponent[Props, js.Object, js.Any]
  
  @js.native
  trait RenderProps extends StObject {
    
    /**
      * Ref to hook the countUp instance to
      */
    var countUpRef: RefObject[js.Any] = js.native
    
    /**
      * Pauses or resumes the transition
      */
    def pauseResume(): Unit = js.native
    
    /**
      * Resets to initial value
      */
    def reset(): Unit = js.native
    
    /**
      * Starts or restarts the transition
      */
    def start(): Unit = js.native
    
    /**
      * Updates transition to the new end value (if given)
      */
    def update(): Unit = js.native
    def update(newEnd: Double): Unit = js.native
  }
}
