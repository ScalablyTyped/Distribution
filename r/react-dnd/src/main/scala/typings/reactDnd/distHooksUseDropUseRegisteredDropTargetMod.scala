package typings.reactDnd

import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDnd.distInternalsMod.TargetConnector
import typings.reactDnd.distTypesMonitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDropUseRegisteredDropTargetMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/useRegisteredDropTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRegisteredDropTarget[O, R, P](spec: DropTargetHookSpec[O, R, P], monitor: DropTargetMonitor[O, R], connector: TargetConnector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRegisteredDropTarget")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
