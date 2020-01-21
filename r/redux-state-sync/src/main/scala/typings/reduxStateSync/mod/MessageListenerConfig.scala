package typings.reduxStateSync.mod

import typings.redux.mod.AnyAction
import typings.std.BroadcastChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageListenerConfig extends js.Object {
  var channel: BroadcastChannel = js.native
  def allowed(action: AnyAction): Boolean = js.native
  def dispatch(action: AnyAction): Unit = js.native
  def dispatch(action: StampedAction): Unit = js.native
}

