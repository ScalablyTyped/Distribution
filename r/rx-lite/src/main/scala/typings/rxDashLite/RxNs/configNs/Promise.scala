package typings.rxDashLite.RxNs.configNs

import org.scalablytyped.runtime.Instantiable1
import typings.rxDashCore.RxNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.config.Promise")
@js.native
class Promise[T] protected () extends IPromise[T] {
  def this(resolver: js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ]) = this()
}

@JSGlobal("Rx.config.Promise")
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

