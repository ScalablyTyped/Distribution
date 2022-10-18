package typings.reactDnd

import typings.dndCore.distInterfacesMod.Backend
import typings.dndCore.distInterfacesMod.DragDropManager
import typings.dndCore.distInterfacesMod.DragSource
import typings.dndCore.distInterfacesMod.DropTarget
import typings.dndCore.distInterfacesMod.Identifier
import typings.dndCore.distInterfacesMod.SourceType
import typings.dndCore.distInterfacesMod.TargetType
import typings.dndCore.distInterfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsMod {
  
  @JSImport("react-dnd/dist/internals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd/dist/internals", "DragSourceMonitorImpl")
  @js.native
  open class DragSourceMonitorImpl protected ()
    extends typings.reactDnd.distInternalsDragSourceMonitorImplMod.DragSourceMonitorImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "DropTargetMonitorImpl")
  @js.native
  open class DropTargetMonitorImpl protected ()
    extends typings.reactDnd.distInternalsDropTargetMonitorImplMod.DropTargetMonitorImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "SourceConnector")
  @js.native
  open class SourceConnector protected ()
    extends typings.reactDnd.distInternalsSourceConnectorMod.SourceConnector {
    def this(backend: Backend) = this()
  }
  
  @JSImport("react-dnd/dist/internals", "TargetConnector")
  @js.native
  open class TargetConnector protected ()
    extends typings.reactDnd.distInternalsTargetConnectorMod.TargetConnector {
    def this(backend: Backend) = this()
  }
  
  inline def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSource")(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
  
  inline def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTarget")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
}
