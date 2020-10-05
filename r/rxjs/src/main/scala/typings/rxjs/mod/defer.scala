package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "defer")
@js.native
object defer extends js.Object {
  def apply[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
}

