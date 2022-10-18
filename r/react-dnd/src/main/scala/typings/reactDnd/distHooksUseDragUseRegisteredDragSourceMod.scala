package typings.reactDnd

import typings.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typings.reactDnd.distInternalsMod.SourceConnector
import typings.reactDnd.distTypesMonitorsMod.DragSourceMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDragUseRegisteredDragSourceMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/useRegisteredDragSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRegisteredDragSource[O, R, P](spec: DragSourceHookSpec[O, R, P], monitor: DragSourceMonitor[O, R], connector: SourceConnector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRegisteredDragSource")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
