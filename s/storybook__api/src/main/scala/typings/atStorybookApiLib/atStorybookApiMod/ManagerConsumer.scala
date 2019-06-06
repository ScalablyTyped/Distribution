package typings
package atStorybookApiLib.atStorybookApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagerConsumer
  extends reactLib.reactMod.Component[ConsumerProps[SubState, Combo], js.Object, js.Any] {
  var dataMemory: js.UndefOr[js.Function1[/* combo */ Combo, SubState]] = js.native
  var prevChildren: js.UndefOr[reactLib.reactMod.ReactElement[_] | scala.Null] = js.native
  var prevData: js.UndefOr[SubState] = js.native
}

