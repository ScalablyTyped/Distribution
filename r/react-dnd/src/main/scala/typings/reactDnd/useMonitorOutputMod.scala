package typings.reactDnd

import typings.reactDnd.monitorsMod.HandlerManager
import typings.reactDnd.monitorsMod.MonitorEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMonitorOutputMod {
  
  @JSImport("react-dnd/lib/hooks/internal/useMonitorOutput", "useMonitorOutput")
  @js.native
  def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](monitor: Monitor with MonitorEventEmitter, collect: js.Function1[/* monitor */ Monitor, Collected]): Collected = js.native
  @JSImport("react-dnd/lib/hooks/internal/useMonitorOutput", "useMonitorOutput")
  @js.native
  def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](
    monitor: Monitor with MonitorEventEmitter,
    collect: js.Function1[/* monitor */ Monitor, Collected],
    onCollect: js.Function0[Unit]
  ): Collected = js.native
}
