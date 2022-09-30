package typings.reactDnd

import typings.reactDnd.monitorsMod.HandlerManager
import typings.reactDnd.monitorsMod.MonitorEventEmitter
import typings.reactDnd.sourceConnectorMod.Connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollectedPropsMod {
  
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
