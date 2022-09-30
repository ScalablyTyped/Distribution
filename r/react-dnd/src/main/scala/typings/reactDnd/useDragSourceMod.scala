package typings.reactDnd

import typings.reactDnd.dragSourceImplMod.DragSourceImpl
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.sourceConnectorMod.Connector
import typings.reactDnd.typesMod.DragSourceHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragSourceMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/useDragSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragSource[O, R, P](spec: DragSourceHookSpec[O, R, P], monitor: DragSourceMonitor[O, R], connector: Connector): DragSourceImpl[O, R, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragSource")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[DragSourceImpl[O, R, P]]
}
