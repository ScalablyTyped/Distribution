package typings.serverDestroy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("http", JSImport.Namespace)
@js.native
object httpAugmentingMod extends js.Object {
  @js.native
  trait Server extends js.Object {
    def destroy(): Unit = js.native
    def destroy(callback: js.Function0[Unit]): Unit = js.native
  }
  
}

