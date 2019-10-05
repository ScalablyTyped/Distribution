package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "using")
@js.native
object using extends js.Object {
  def apply[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
}

