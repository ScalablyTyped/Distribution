package typings.reactDnd

import typings.dndCore.distInterfacesMod.DragDropMonitor
import typings.dndCore.distInterfacesMod.DragSource
import typings.dndCore.distInterfacesMod.Identifier
import typings.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typings.reactDnd.distInternalsSourceConnectorMod.Connector
import typings.reactDnd.distTypesMonitorsMod.DragSourceMonitor
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDragDragSourceImplMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/DragSourceImpl", "DragSourceImpl")
  @js.native
  open class DragSourceImpl[O, R, P] protected ()
    extends StObject
       with DragSource {
    def this(spec: DragSourceHookSpec[O, R, P], monitor: DragSourceMonitor[O, R], connector: Connector) = this()
    
    def beginDrag(): NonNullable[O] | Null = js.native
    /* CompleteClass */
    override def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
    
    def canDrag(): Boolean = js.native
    /* CompleteClass */
    override def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
    
    /* private */ var connector: Any = js.native
    
    def endDrag(): Unit = js.native
    /* CompleteClass */
    override def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
    
    /* CompleteClass */
    override def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
    
    /* private */ var monitor: Any = js.native
    
    var spec: DragSourceHookSpec[O, R, P] = js.native
  }
}
