package typings.reactDnd

import typings.react.mod.MutableRefObject
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DropTargetHookSpec
import typings.reactDnd.monitorsMod.DropTargetMonitor
import typings.reactDnd.targetConnectorMod.TargetConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropMod {
  
  @JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDropHandler")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropTargetMonitor")().asInstanceOf[js.Tuple2[DropTargetMonitor, TargetConnector]]
}
