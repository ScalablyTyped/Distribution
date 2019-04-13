package typings
package rxDashLiteLib.RxNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.config.Promise")
@js.native
class Promise[T] protected ()
  extends rxDashCoreLib.RxNs.IPromise[T] {
  def this(resolver: js.Function2[
      /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
      /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
      scala.Unit
    ]) = this()
}

@JSGlobal("Rx.config.Promise")
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

