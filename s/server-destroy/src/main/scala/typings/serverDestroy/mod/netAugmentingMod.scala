package typings.serverDestroy.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("net", JSImport.Namespace)
@js.native
object netAugmentingMod extends js.Object {
  
  @js.native
  trait Server extends js.Object {
    
    def destroy(): Unit = js.native
    def destroy(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
}
