package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.sourceConnectorMod.Connector
import typings.reactDnd.typesMod.DragSourceHookSpec
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceImplMod {
  
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
