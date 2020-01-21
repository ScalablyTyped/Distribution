package typings.rmcInputNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumber
  extends typings.rmcInputNumber.baseMod.default[PropsType, StateType] {
  var end: js.Any = js.native
  var input: js.Any = js.native
  var start: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MInputNumber(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInputNumber(): Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MInputNumber(): Unit = js.native
  def focus(): Unit = js.native
  def formatWrapper(num: js.Any): js.Any = js.native
  def getRatio(e: js.Any): Double = js.native
  def setInput(input: js.Any): Unit = js.native
}

