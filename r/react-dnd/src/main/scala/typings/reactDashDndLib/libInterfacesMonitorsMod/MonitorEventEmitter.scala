package typings
package reactDashDndLib.libInterfacesMonitorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorEventEmitter extends js.Object {
  def subscribeToStateChange(fn: js.Function0[scala.Unit]): dndDashCoreLib.libInterfacesMod.Unsubscribe = js.native
  def subscribeToStateChange(fn: js.Function0[scala.Unit], options: reactDashDndLib.Anon_HandlerIds): dndDashCoreLib.libInterfacesMod.Unsubscribe = js.native
}

