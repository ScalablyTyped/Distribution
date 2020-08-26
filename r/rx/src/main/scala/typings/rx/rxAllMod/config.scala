package typings.rx.rxAllMod

import org.scalablytyped.runtime.Instantiable1
import typings.rx.Rx.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.all", "config")
@js.native
object config extends js.Object {
  @js.native
  class Promise[T] protected () extends IPromise[T] {
    def this(resolver: js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ]) = this()
  }
  
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

