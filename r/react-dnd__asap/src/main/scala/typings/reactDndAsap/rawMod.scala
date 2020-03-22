package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-dnd/asap/lib/node/raw", JSImport.Namespace)
@js.native
object rawMod extends js.Object {
  @js.native
  object rawAsap extends js.Object {
    var requestFlush: js.Function0[Unit] = js.native
    def apply(task: Task): Unit = js.native
  }
  
}

