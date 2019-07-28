package typings.relayDashRuntime.relayDashRuntimeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./network/RelayObservable
@js.native
trait RelayObservable[T] extends Subscribable[T] {
  def `catch`[U](fn: js.Function1[/* error */ Error, RelayObservable[U]]): RelayObservable[T | U] = js.native
  def `do`(observer: Observer[T]): RelayObservable[T] = js.native
  def `finally`(fn: js.Function0[_]): RelayObservable[T] = js.native
  def ifEmpty[U](alternate: RelayObservable[U]): RelayObservable[T | U] = js.native
  def map[U](fn: js.Function1[/* value */ T, U]): RelayObservable[U] = js.native
  def mergeMap[U](fn: js.Function1[/* value */ T, ObservableFromValue[U]]): RelayObservable[U] = js.native
  def poll(pollInterval: Double): RelayObservable[T] = js.native
  def subscribeLegacy(legacyObserver: LegacyObserver[T]): Disposable = js.native
  def toPromise(): js.Promise[js.UndefOr[T]] = js.native
}

