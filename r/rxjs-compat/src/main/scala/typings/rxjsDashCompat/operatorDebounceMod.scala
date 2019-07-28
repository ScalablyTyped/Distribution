package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SubscribableOrPromise
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/debounce", JSImport.Namespace)
@js.native
object operatorDebounceMod extends js.Object {
  def debounce[T](`this`: Observable[T], durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): Observable[T] = js.native
}

