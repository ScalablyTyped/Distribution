package typings.reactDnd

import typings.reactDnd.distInternalsSourceConnectorMod.Connector
import typings.reactDnd.distTypesMonitorsMod.HandlerManager
import typings.reactDnd.distTypesMonitorsMod.MonitorEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseCollectedPropsMod {
  
  @JSImport("react-dnd/dist/hooks/useCollectedProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCollectedProps[Collected, Monitor /* <: HandlerManager */](
    collector: js.Function1[/* monitor */ Monitor, Collected],
    monitor: Monitor & MonitorEventEmitter,
    connector: Connector
  ): Collected = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectedProps")(collector.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Collected]
  inline def useCollectedProps[Collected, Monitor /* <: HandlerManager */](collector: Unit, monitor: Monitor & MonitorEventEmitter, connector: Connector): Collected = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectedProps")(collector.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Collected]
}
