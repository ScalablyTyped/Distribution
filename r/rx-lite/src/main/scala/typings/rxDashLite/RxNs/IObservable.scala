package typings.rxDashLite.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable[T] extends js.Object {
  def subscribe(): IDisposable = js.native
  def subscribe(observer: Observer[T]): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[Unit]): IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[Unit], thisArg: js.Any): IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, Unit], thisArg: js.Any): IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit], thisArg: js.Any): IDisposable = js.native
}

