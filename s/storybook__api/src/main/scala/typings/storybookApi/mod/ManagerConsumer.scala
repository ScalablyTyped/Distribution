package typings.storybookApi.mod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagerConsumer
  extends Component[ConsumerProps[SubState, Combo], js.Object, js.Any] {
  var dataMemory: js.UndefOr[js.Function1[/* combo */ Combo, SubState]] = js.native
  var prevChildren: js.UndefOr[ReactElement | Null] = js.native
  var prevData: js.UndefOr[SubState] = js.native
}

