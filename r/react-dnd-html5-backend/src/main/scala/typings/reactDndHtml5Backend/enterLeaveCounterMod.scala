package typings.reactDndHtml5Backend

import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-html5-backend/lib/EnterLeaveCounter", JSImport.Namespace)
@js.native
object enterLeaveCounterMod extends js.Object {
  
  @js.native
  class EnterLeaveCounter protected () extends js.Object {
    def this(isNodeInDocument: NodePredicate) = this()
    
    def enter(): Boolean = js.native
    def enter(enteringNode: EventTarget): Boolean = js.native
    
    var entered: js.Any = js.native
    
    var isNodeInDocument: js.Any = js.native
    
    def leave(): Boolean = js.native
    def leave(leavingNode: EventTarget): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  type NodePredicate = js.Function1[/* node */ js.UndefOr[Node | Null], Boolean]
}
