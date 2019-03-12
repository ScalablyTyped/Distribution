package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEvent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromEvent[T](target: FromEventTarget[T], eventName: java.lang.String): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: java.lang.String, options: EventListenerOptions): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: java.lang.String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: java.lang.String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
}

