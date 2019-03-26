package typings
package reactDashDndLib.libCjsInterfacesMonitorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorEventEmitter extends js.Object {
  def subscribeToStateChange(fn: js.Function0[scala.Unit]): dndDashCoreLib.libCjsInterfacesMod.Unsubscribe = js.native
  def subscribeToStateChange(fn: js.Function0[scala.Unit], options: reactDashDndLib.Anon_HandlerIds): dndDashCoreLib.libCjsInterfacesMod.Unsubscribe = js.native
}

