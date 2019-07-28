package typings.rxDashLite.rxDashLiteMod

import org.scalablytyped.runtime.Instantiable1
import typings.rxDashCore.RxNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "config")
@js.native
object configNs extends js.Object {
  @js.native
  class Promise[T] protected () extends IPromise[T] {
    def this(resolver: js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ]) = this()
  }
  
  /**
    * Configuration option to determine whether to use native events only
    */
  val useNativeEvents: Boolean = js.native
  @js.native
  object Promise
    extends Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ js.Object, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ], 
          IPromise[js.Object]
        ]
  
}

