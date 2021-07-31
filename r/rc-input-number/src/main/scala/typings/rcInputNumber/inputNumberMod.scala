package typings.rcInputNumber

import typings.node.NodeJS.Timer
import typings.rcInputNumber.anon.PartialInputNumberProps
import typings.rcInputNumber.interfaceMod.InputNumberProps
import typings.rcInputNumber.interfaceMod.InputNumberState
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputNumberMod {
  
  @JSImport("rc-input-number/es/InputNumber", JSImport.Default)
  @js.native
  class default protected () extends InputNumber {
    def this(props: InputNumberProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      @scala.inline
      def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.focusOnUpDown")
      @js.native
      def focusOnUpDown: Boolean = js.native
      @scala.inline
      def focusOnUpDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOnUpDown")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.max")
      @js.native
      def max: Double = js.native
      @scala.inline
      def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.min")
      @js.native
      def min: Double = js.native
      @scala.inline
      def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.onBlur")
      @js.native
      def onBlur: js.Function0[Unit] = js.native
      @scala.inline
      def onBlur_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      @scala.inline
      def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.onFocus")
      @js.native
      def onFocus: js.Function0[Unit] = js.native
      @scala.inline
      def onFocus_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.onKeyDown")
      @js.native
      def onKeyDown: js.Function0[Unit] = js.native
      @scala.inline
      def onKeyDown_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.onPressEnter")
      @js.native
      def onPressEnter: js.Function0[Unit] = js.native
      @scala.inline
      def onPressEnter_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPressEnter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def parser(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(input.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      @scala.inline
      def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.step")
      @js.native
      def step: Double = js.native
      @scala.inline
      def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-input-number/es/InputNumber", "default.defaultProps.useTouch")
      @js.native
      def useTouch: Boolean = js.native
      @scala.inline
      def useTouch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTouch")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InputNumber
    extends Component[PartialInputNumberProps, InputNumberState, js.Any] {
    
    var autoStepTimer: Timer = js.native
    
    def blur(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInputNumber(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputNumber(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInputNumber(): Unit = js.native
    
    var currentValue: Double | String = js.native
    
    var cursorAfter: Double | String = js.native
    
    var cursorBefore: String = js.native
    
    var cursorEnd: Double = js.native
    
    var cursorStart: Double = js.native
    
    def down(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    def downStep(`val`: js.Any, rat: js.Any): js.Any = js.native
    
    def fixCaret(start: js.Any, end: js.Any): Unit = js.native
    
    def focus(): Unit = js.native
    
    def formatWrapper(num: js.Any): js.Any = js.native
    
    def getCurrentValidValue(value: js.Any): js.Any = js.native
    
    def getFullNum(num: js.Any): js.Any = js.native
    
    def getInputDisplayValue(state: js.Any): js.Any = js.native
    
    def getMaxPrecision(currentValue: js.Any): Double = js.native
    def getMaxPrecision(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getPrecision(value: js.Any): Double = js.native
    
    def getPrecisionFactor(currentValue: js.Any): Double = js.native
    def getPrecisionFactor(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getRatio(e: js.Any): Double = js.native
    
    def getValidValue(value: js.Any): js.Any = js.native
    def getValidValue(value: js.Any, min: Double): js.Any = js.native
    def getValidValue(value: js.Any, min: Double, max: Double): js.Any = js.native
    def getValidValue(value: js.Any, min: Unit, max: Double): js.Any = js.native
    
    def getValueFromEvent(e: js.Any): js.Any = js.native
    
    var input: HTMLInputElement = js.native
    
    var inputting: Boolean = js.native
    
    def isNotCompleteNumber(num: js.Any): Boolean = js.native
    
    var lastKeyCode: js.Any = js.native
    
    def onBlur(args: js.Any*): Unit = js.native
    
    def onChange(e: js.Any): Unit = js.native
    
    def onFocus(args: js.Any*): Unit = js.native
    
    def onKeyDown(e: js.Any, args: js.Any*): Unit = js.native
    
    def onKeyUp(e: js.Any, args: js.Any*): Unit = js.native
    
    def onMouseUp(args: js.Any*): Unit = js.native
    
    def partRestoreByAfter(str: js.Any): js.Any = js.native
    
    var pressingUpOrDown: Boolean = js.native
    
    var rawInput: js.Any = js.native
    
    def recordCursorPosition(): Unit = js.native
    
    def restoreByAfter(str: js.Any): Boolean = js.native
    
    def saveInput(node: js.Any): Unit = js.native
    
    def select(): Unit = js.native
    
    def setValue(v: js.Any, callback: js.Any): Double = js.native
    
    def step(`type`: js.Any, e: js.Any, ratio: Double, recursive: js.Any): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toNumber(num: js.Any): js.Any = js.native
    
    def toPrecisionAsStep(num: js.Any): js.Any = js.native
    
    def up(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    def upStep(`val`: js.Any, rat: js.Any): js.Any = js.native
  }
}
