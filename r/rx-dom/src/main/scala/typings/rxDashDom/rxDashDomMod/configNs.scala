package typings.rxDashDom.rxDashDomMod

import org.scalablytyped.runtime.Instantiable1
import typings.rxDashCore.RxNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "config")
@js.native
object configNs extends js.Object {
  @js.native
  class Promise[T] protected ()
    extends typings.rx.rxMod.configNs.Promise[T] {
    def this(resolver: js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ]) = this()
  }
  
  @js.native
  class PromiseCls[T] protected ()
    extends typings.rx.rxMod.configNs.PromiseCls[T] {
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

