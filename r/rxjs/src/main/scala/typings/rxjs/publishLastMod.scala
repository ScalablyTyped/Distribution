package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishLast", JSImport.Namespace)
@js.native
object publishLastMod extends js.Object {
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}

