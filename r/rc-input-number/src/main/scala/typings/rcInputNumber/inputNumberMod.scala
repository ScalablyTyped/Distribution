package typings.rcInputNumber

import typings.node.NodeJS.Timer
import typings.rcInputNumber.anon.AutoComplete
import typings.rcInputNumber.anon.PartialInputNumberProps
import typings.rcInputNumber.interfaceMod.InputNumberProps
import typings.rcInputNumber.interfaceMod.InputNumberState
import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-input-number/es/InputNumber", JSImport.Namespace)
@js.native
object inputNumberMod extends js.Object {
  
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
    def getValidValue(value: js.Any, min: js.UndefOr[scala.Nothing], max: Double): js.Any = js.native
    def getValidValue(value: js.Any, min: Double): js.Any = js.native
    def getValidValue(value: js.Any, min: Double, max: Double): js.Any = js.native
    
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
  
  @js.native
  class default protected () extends InputNumber {
    def this(props: InputNumberProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AutoComplete = js.native
  }
}
