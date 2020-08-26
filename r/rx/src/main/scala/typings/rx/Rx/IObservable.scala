package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable[T] extends ObservableOrPromise[T] {
  /**
    *  Subscribes an o to the observable sequence.
    *  @param {Mixed} [oOrOnNext] The object that is to receive notifications or an action to invoke for each element in the observable sequence.
    *  @param {Function} [onError] Action to invoke upon exceptional termination of the observable sequence.
    *  @param {Function} [onCompleted] Action to invoke upon graceful termination of the observable sequence.
    *  @returns {Diposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def subscribe(): IDisposable = js.native
  /**
    *  Subscribes an o to the observable sequence.
    *  @param {Mixed} [oOrOnNext] The object that is to receive notifications or an action to invoke for each element in the observable sequence.
    *  @param {Function} [onError] Action to invoke upon exceptional termination of the observable sequence.
    *  @param {Function} [onCompleted] Action to invoke upon graceful termination of the observable sequence.
    *  @returns {Diposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def subscribe(observer: IObserver[T]): IDisposable = js.native
  def subscribe(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def subscribe(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
}

