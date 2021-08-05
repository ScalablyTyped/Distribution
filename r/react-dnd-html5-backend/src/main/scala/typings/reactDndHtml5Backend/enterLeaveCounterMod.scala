package typings.reactDndHtml5Backend

import typings.std.EventTarget
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterLeaveCounterMod {
  
  @JSImport("react-dnd-html5-backend/lib/EnterLeaveCounter", "EnterLeaveCounter")
  @js.native
  class EnterLeaveCounter protected () extends StObject {
    def this(isNodeInDocument: NodePredicate) = this()
    
    def enter(): Boolean = js.native
    def enter(enteringNode: EventTarget): Boolean = js.native
    
    /* private */ var entered: js.Any = js.native
    
    /* private */ var isNodeInDocument: js.Any = js.native
    
    def leave(): Boolean = js.native
    def leave(leavingNode: EventTarget): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  type NodePredicate = js.Function1[/* node */ js.UndefOr[Node | Null], Boolean]
}
