package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "config")
@js.native
object configNs extends js.Object {
  @js.native
  class Promise[T] protected ()
    extends rxLib.rxMod.configNs.Promise[T] {
    def this(resolver: js.Function2[
          /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
          /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  @js.native
  class PromiseCls[T] protected ()
    extends rxLib.rxMod.configNs.PromiseCls[T] {
    def this(resolver: js.Function2[
          /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
          /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  var Promise: rxDashLiteLib.Anon_Reason = js.native
  /**
    * Configuration option to determine whether to use native events only
    */
  val useNativeEvents: scala.Boolean = js.native
}

