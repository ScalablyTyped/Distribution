package typings.atStorybookApi.atStorybookApiMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagerConsumer
  extends Component[ConsumerProps[SubState, Combo], js.Object, js.Any] {
  var dataMemory: js.UndefOr[js.Function1[/* combo */ Combo, SubState]] = js.native
  var prevChildren: js.UndefOr[ReactElement | Null] = js.native
  var prevData: js.UndefOr[SubState] = js.native
}

