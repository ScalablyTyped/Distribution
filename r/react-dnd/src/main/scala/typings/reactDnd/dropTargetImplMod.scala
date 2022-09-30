package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.monitorsMod.DropTargetMonitor
import typings.reactDnd.typesMod.DropTargetHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropTargetImplMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/DropTargetImpl", "DropTargetImpl")
  @js.native
  open class DropTargetImpl[O, R, P] protected ()
    extends StObject
       with DropTarget {
    def this(spec: DropTargetHookSpec[O, R, P], monitor: DropTargetMonitor[O, R]) = this()
    
    def canDrop(): Boolean = js.native
    /* CompleteClass */
    override def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
    
    def drop(): js.UndefOr[R] = js.native
    /* CompleteClass */
    override def drop(monitor: DragDropMonitor, targetId: Identifier): Any = js.native
    
    def hover(): Unit = js.native
    /* CompleteClass */
    override def hover(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
    
    /* private */ var monitor: Any = js.native
    
    var spec: DropTargetHookSpec[O, R, P] = js.native
  }
}
