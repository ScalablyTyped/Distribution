package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.SourceType
import typings.dndCore.interfacesMod.TargetType
import typings.dndCore.interfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalsMod {
  
  @JSImport("react-dnd/dist/internals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd/dist/internals", "DragSourceMonitorImpl")
  @js.native
  open class DragSourceMonitorImpl protected ()
    extends typings.reactDnd.dragSourceMonitorImplMod.DragSourceMonitorImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "DropTargetMonitorImpl")
  @js.native
  open class DropTargetMonitorImpl protected ()
    extends typings.reactDnd.dropTargetMonitorImplMod.DropTargetMonitorImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "SourceConnector")
  @js.native
  open class SourceConnector protected ()
    extends typings.reactDnd.sourceConnectorMod.SourceConnector {
    def this(backend: Backend) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "TargetConnector")
  @js.native
  open class TargetConnector protected ()
    extends typings.reactDnd.targetConnectorMod.TargetConnector {
    def this(backend: Backend) = this()
  }
  
  inline def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSource")(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
  
  inline def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTarget")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
}
