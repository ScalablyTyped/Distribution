package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prex/out/lib/pulsar", JSImport.Namespace)
@js.native
object pulsarMod extends js.Object {
  
  @js.native
  class Pulsar () extends js.Object {
    
    var _waiters: js.Any = js.native
    
    /**
      * Notifies the next waiter.
      */
    def pulse(): Unit = js.native
    
    /**
      * Notifies all waiters.
      */
    def pulseAll(): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
