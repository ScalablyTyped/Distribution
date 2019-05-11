package typings
package rmcDashCascaderLib.esCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends reactLib.reactMod.Component[rmcDashCascaderLib.esCascaderTypesMod.ICascaderProps, js.Any, js.Any] {
  @JSName("state")
  var state_Cascader: rmcDashCascaderLib.Anon_Value = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCascader(nextProps: js.Any): scala.Unit = js.native
  def getCols(): js.Any = js.native
  def getValue(d: js.Any, `val`: js.Any): js.Any = js.native
  def onValueChange(value: js.Any, index: js.Any): scala.Unit = js.native
}

