package typings
package reactDashSideDashEffectLib.reactDashSideDashEffectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithSideEffect extends js.Object {
  def apply[TProp, TState](
    reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
    handleStateChangeOnClient: js.Function1[/* state */ TState, scala.Unit]
  ): ClassDecorator[TProp, TState, TState] = js.native
  def apply[TProp, TState, TServerState](
    reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
    handleStateChangeOnClient: js.Function1[/* state */ TState, scala.Unit],
    mapStateOnServer: js.Function1[/* state */ TState, TServerState]
  ): ClassDecorator[TProp, TState | TServerState, TServerState] = js.native
}

