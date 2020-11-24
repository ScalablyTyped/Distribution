package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-dnd/asap/lib/node/raw", JSImport.Namespace)
@js.native
object rawMod extends js.Object {
  
  @js.native
  object rawAsap extends js.Object {
    
    def apply(task: Task): Unit = js.native
    
    var requestFlush: js.Function0[Unit] = js.native
  }
}
