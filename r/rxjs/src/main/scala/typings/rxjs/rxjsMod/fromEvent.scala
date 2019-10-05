package typings.rxjs.rxjsMod

import typings.rxjs.internalObservableFromEventMod.EventListenerOptions
import typings.rxjs.internalObservableFromEventMod.FromEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[T](target: FromEventTarget[T], eventName: String): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
}

