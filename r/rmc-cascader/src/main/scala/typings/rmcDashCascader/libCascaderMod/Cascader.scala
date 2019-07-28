package typings.rmcDashCascader.libCascaderMod

import typings.react.reactMod.Component
import typings.rmcDashCascader.Anon_Value
import typings.rmcDashCascader.libCascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[ICascaderProps, js.Any, js.Any] {
  @JSName("state")
  var state_Cascader: Anon_Value = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCascader(nextProps: js.Any): Unit = js.native
  def getCols(): js.Any = js.native
  def getValue(d: js.Any, `val`: js.Any): js.Any = js.native
  def onValueChange(value: js.Any, index: js.Any): Unit = js.native
}

