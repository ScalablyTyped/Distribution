package typings
package reduxDashStateDashSyncLib.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageListenerConfig extends js.Object {
  var channel: stdLib.BroadcastChannel = js.native
  def allowed(): scala.Boolean = js.native
  def allowed(`type`: java.lang.String): scala.Boolean = js.native
  def dispatch(action: StampedAction): scala.Unit = js.native
  def dispatch(action: reduxLib.reduxMod.AnyAction): scala.Unit = js.native
}

