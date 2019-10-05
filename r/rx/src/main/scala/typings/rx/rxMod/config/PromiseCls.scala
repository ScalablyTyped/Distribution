package typings.rx.rxMod.config

import typings.rxDashCore.Rx.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "config.Promise")
@js.native
class PromiseCls[T] protected () extends IPromise[T] {
  def this(resolver: js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ]) = this()
}

