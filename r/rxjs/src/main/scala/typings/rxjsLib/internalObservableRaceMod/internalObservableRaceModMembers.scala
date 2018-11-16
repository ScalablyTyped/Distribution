package typings
package rxjsLib.internalObservableRaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", JSImport.Namespace)
@js.native
object internalObservableRaceModMembers extends js.Object {
  def race[T](
    observables: (rxjsLib.internalObservableMod.Observable[T] | js.Array[rxjsLib.internalObservableMod.Observable[T]])*
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def race[T](observables: js.Array[rxjsLib.internalObservableMod.Observable[_ | T]]): rxjsLib.internalObservableMod.Observable[T] = js.native
}

