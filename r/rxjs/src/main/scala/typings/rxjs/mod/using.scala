package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "using")
@js.native
object using extends js.Object {
  def apply[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = js.native
}

