package typings.rxjs.internalObservableFromEventMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEvent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromEvent[T](target: FromEventTarget[T], eventName: String): Observable[T] = js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}

