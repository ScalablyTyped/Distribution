package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDnd.monitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropTargetMonitorImplMod {
  
  @JSImport("react-dnd/lib/common/DropTargetMonitorImpl", "DropTargetMonitorImpl")
  @js.native
  class DropTargetMonitorImpl protected ()
    extends StObject
       with DropTargetMonitor {
    def this(manager: DragDropManager) = this()
    
    var internalMonitor: js.Any = js.native
    
    var targetId: js.Any = js.native
  }
}
