package typings.reduxStateSync.mod

import typings.redux.mod.AnyAction
import typings.std.BroadcastChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageListenerConfig extends js.Object {
  
  def allowed(action: AnyAction): Boolean = js.native
  
  var channel: BroadcastChannel = js.native
  
  def dispatch(action: AnyAction): Unit = js.native
  def dispatch(action: StampedAction): Unit = js.native
}
