package typings
package rxLib.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "config")
@js.native
object configNs extends js.Object {
  @js.native
  class Promise[T] protected ()
    extends rxDashLiteLib.RxNs.configNs.Promise[T] {
    def this(resolver: js.Function2[
          /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
          /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  @js.native
  class PromiseCls[T] protected ()
    extends rxDashCoreLib.RxNs.IPromise[T] {
    def this(resolver: js.Function2[
          /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
          /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  /**
    * Configuration option to determine whether to use native events only
    */
  val useNativeEvents: scala.Boolean = js.native
  @js.native
  object Promise
    extends org.scalablytyped.runtime.Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ js.Object, scala.Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
            scala.Unit
          ], 
          rxDashCoreLib.RxNs.IPromise[js.Object]
        ]
  
}

