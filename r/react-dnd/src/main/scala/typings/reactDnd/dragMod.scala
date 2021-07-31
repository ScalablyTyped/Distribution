package typings.reactDnd

import typings.react.mod.MutableRefObject
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.sourceConnectorMod.SourceConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragMod {
  
  @JSImport("react-dnd/lib/hooks/internal/drag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragHandler")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceMonitor")().asInstanceOf[js.Tuple2[DragSourceMonitor, SourceConnector]]
}
