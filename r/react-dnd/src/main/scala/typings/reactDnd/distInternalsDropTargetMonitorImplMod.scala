package typings.reactDnd

import typings.dndCore.distInterfacesMod.DragDropManager
import typings.reactDnd.distTypesMonitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsDropTargetMonitorImplMod {
  
  @JSImport("react-dnd/dist/internals/DropTargetMonitorImpl", "DropTargetMonitorImpl")
  @js.native
  open class DropTargetMonitorImpl protected ()
    extends StObject
       with DropTargetMonitor[Any, Any] {
    def this(manager: DragDropManager) = this()
    
    /* private */ var internalMonitor: Any = js.native
    
    /* private */ var targetId: Any = js.native
  }
}
