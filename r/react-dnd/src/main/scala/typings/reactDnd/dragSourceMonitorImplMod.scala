package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.Listener
import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDnd.anon.Shallow
import typings.reactDnd.monitorsMod.DragSourceMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceMonitorImplMod {
  
  @JSImport("react-dnd/dist/internals/DragSourceMonitorImpl", "DragSourceMonitorImpl")
  @js.native
  open class DragSourceMonitorImpl protected ()
    extends StObject
       with DragSourceMonitor[Any, Any] {
    def this(manager: DragDropManager) = this()
    
    def canDragSource(sourceId: Identifier): Boolean = js.native
    
    def canDropOnTarget(targetId: Identifier): Boolean = js.native
    
    def getSourceId(): Identifier | Null = js.native
    
    /* private */ var internalMonitor: Any = js.native
    
    def isDraggingSource(sourceId: Identifier): Boolean = js.native
    
    def isOverTarget(targetId: Identifier): Boolean = js.native
    def isOverTarget(targetId: Identifier, options: Shallow): Boolean = js.native
    
    def isSourcePublic(): Boolean | Null = js.native
    
    /* private */ var sourceId: Any = js.native
    
    def subscribeToOffsetChange(listener: Listener): Unsubscribe = js.native
  }
}
