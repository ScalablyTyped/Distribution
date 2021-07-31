package typings.rcInputNumber

import typings.rcInputNumber.interfaceMod.InputNumberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcInputNumber.inputNumberMod.default {
    def this(props: InputNumberProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-input-number", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-input-number", "default.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      @scala.inline
      def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.focusOnUpDown")
      @js.native
      def focusOnUpDown: Boolean = js.native
      @scala.inline
      def focusOnUpDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOnUpDown")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.max")
      @js.native
      def max: Double = js.native
      @scala.inline
      def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.min")
      @js.native
      def min: Double = js.native
      @scala.inline
      def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.onBlur")
      @js.native
      def onBlur: js.Function0[Unit] = js.native
      @scala.inline
      def onBlur_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      @scala.inline
      def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.onFocus")
      @js.native
      def onFocus: js.Function0[Unit] = js.native
      @scala.inline
      def onFocus_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.onKeyDown")
      @js.native
      def onKeyDown: js.Function0[Unit] = js.native
      @scala.inline
      def onKeyDown_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.onPressEnter")
      @js.native
      def onPressEnter: js.Function0[Unit] = js.native
      @scala.inline
      def onPressEnter_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPressEnter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def parser(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(input.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("rc-input-number", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      @scala.inline
      def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.step")
      @js.native
      def step: Double = js.native
      @scala.inline
      def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number", "default.defaultProps.useTouch")
      @js.native
      def useTouch: Boolean = js.native
      @scala.inline
      def useTouch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTouch")(x.asInstanceOf[js.Any])
    }
  }
}
