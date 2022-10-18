package typings.reactDnd

import typings.reactDnd.distTypesMonitorsMod.HandlerManager
import typings.reactDnd.distTypesMonitorsMod.MonitorEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseMonitorOutputMod {
  
  @JSImport("react-dnd/dist/hooks/useMonitorOutput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](monitor: Monitor & MonitorEventEmitter, collect: js.Function1[/* monitor */ Monitor, Collected]): Collected = (^.asInstanceOf[js.Dynamic].applyDynamic("useMonitorOutput")(monitor.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[Collected]
  inline def useMonitorOutput[Monitor /* <: HandlerManager */, Collected](
    monitor: Monitor & MonitorEventEmitter,
    collect: js.Function1[/* monitor */ Monitor, Collected],
    onCollect: js.Function0[Unit]
  ): Collected = (^.asInstanceOf[js.Dynamic].applyDynamic("useMonitorOutput")(monitor.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], onCollect.asInstanceOf[js.Any])).asInstanceOf[Collected]
}
