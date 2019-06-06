package typings
package atStorybookApiLib.atStorybookApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagerProvider
  extends reactLib.reactMod.Component[Props, State, js.Any] {
  var api: API = js.native
  var modules: js.Array[_] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MManagerProvider(): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MManagerProvider(nextProps: Props, nextState: State): scala.Boolean = js.native
}

