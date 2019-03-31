package typings
package rmcDashInputDashNumberLib.libBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseComponent[P /* <: PropsType */, S /* <: StateType */]
  extends reactLib.reactMod.Component[P, S, js.Any] {
  var autoStepTimer: js.Any = js.native
  @JSName("action")
  def action_down(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down, e: js.Any): scala.Unit = js.native
  @JSName("action")
  def action_down(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down, e: js.Any, ratio: js.Any): scala.Unit = js.native
  @JSName("action")
  def action_down(
    `type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down,
    e: js.Any,
    ratio: js.Any,
    recursive: js.Any
  ): scala.Unit = js.native
  @JSName("action")
  def action_up(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up, e: js.Any): scala.Unit = js.native
  @JSName("action")
  def action_up(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up, e: js.Any, ratio: js.Any): scala.Unit = js.native
  @JSName("action")
  def action_up(
    `type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up,
    e: js.Any,
    ratio: js.Any,
    recursive: js.Any
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBaseComponent(nextProps: P): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseComponent(): scala.Unit = js.native
  def down(e: js.Any): scala.Unit = js.native
  def down(e: js.Any, ratio: js.Any): scala.Unit = js.native
  def down(e: js.Any, ratio: js.Any, recursive: js.Any): scala.Unit = js.native
  def getCurrentValidValue(value: js.Any): js.Any = js.native
  def getMaxPrecision(currentValue: js.Any): scala.Double = js.native
  def getMaxPrecision(currentValue: js.Any, ratio: scala.Double): scala.Double = js.native
  def getPrecision(value: js.Any): scala.Double = js.native
  def getPrecisionFactor(currentValue: js.Any): scala.Double = js.native
  def getPrecisionFactor(currentValue: js.Any, ratio: scala.Double): scala.Double = js.native
  def getValidValue(value: js.Any): js.Any = js.native
  def getValueFromEvent(e: js.Any): js.Any = js.native
  def isNotCompleteNumber(num: js.Any): scala.Boolean = js.native
  def onBlur(e: js.Any, args: js.Any*): scala.Unit = js.native
  def onChange(e: js.Any): scala.Unit = js.native
  def onFocus(args: js.Any*): scala.Unit = js.native
  def setValue(v: js.Any): scala.Unit = js.native
  def setValue(v: js.Any, callback: js.Any): scala.Unit = js.native
  @JSName("stepCompute")
  def stepCompute_down(
    `type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down,
    `val`: js.Any,
    rat: js.Any
  ): js.Any = js.native
  @JSName("stepCompute")
  def stepCompute_up(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up, `val`: js.Any, rat: js.Any): js.Any = js.native
  @JSName("step")
  def step_down(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down, e: js.Any): scala.Boolean = js.native
  @JSName("step")
  def step_down(
    `type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.down,
    e: js.Any,
    ratio: scala.Double
  ): scala.Boolean = js.native
  @JSName("step")
  def step_up(`type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up, e: js.Any): scala.Boolean = js.native
  @JSName("step")
  def step_up(
    `type`: rmcDashInputDashNumberLib.rmcDashInputDashNumberLibStrings.up,
    e: js.Any,
    ratio: scala.Double
  ): scala.Boolean = js.native
  def stop(): scala.Unit = js.native
  def toNumber(num: js.Any): js.Any = js.native
  def toNumberWhenUserInput(num: js.Any): js.Any = js.native
  def toPrecisionAsStep(num: js.Any): js.Any = js.native
  def up(e: js.Any): scala.Unit = js.native
  def up(e: js.Any, ratio: js.Any): scala.Unit = js.native
  def up(e: js.Any, ratio: js.Any, recursive: js.Any): scala.Unit = js.native
}

