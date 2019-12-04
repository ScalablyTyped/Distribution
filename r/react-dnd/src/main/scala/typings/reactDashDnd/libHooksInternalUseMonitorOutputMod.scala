package typings.reactDashDnd

import typings.reactDashDnd.libInterfacesMonitorsMod.HandlerManager
import typings.reactDashDnd.libInterfacesMonitorsMod.MonitorEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/useMonitorOutput", JSImport.Namespace)
@js.native
object libHooksInternalUseMonitorOutputMod extends js.Object {
  def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](monitor: Monitor with MonitorEventEmitter, collect: js.Function1[/* monitor */ Monitor, Collected]): Collected = js.native
  def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](
    monitor: Monitor with MonitorEventEmitter,
    collect: js.Function1[/* monitor */ Monitor, Collected],
    onCollect: js.Function0[Unit]
  ): Collected = js.native
}

