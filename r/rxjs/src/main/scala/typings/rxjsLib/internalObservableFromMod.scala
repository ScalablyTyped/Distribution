package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/from", JSImport.Namespace)
@js.native
object internalObservableFromMod extends js.Object {
  def from[T](input: rxjsLib.internalTypesMod.ObservableInput[T | rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def from[T](
    input: rxjsLib.internalTypesMod.ObservableInput[T | rxjsLib.internalTypesMod.ObservableInput[T]],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
}

