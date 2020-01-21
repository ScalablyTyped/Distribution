package typings.relayRuntime.relayObservableMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable")
@js.native
class RelayObservable[T] protected () extends Subscribable[T] {
  // Use RelayObservable.create(source);
  protected def this(source: scala.Nothing) = this()
  /**
    * Similar to promise.catch(), observable.catch() handles error events, and
    * provides an alternative observable to use in it's place.
    *
    * If the catch handler throws a new error, it will appear as an error event
    * on the resulting Observable.
    */
  def `catch`[U](fn: js.Function1[/* error */ Error, RelayObservable[U]]): RelayObservable[T | U] = js.native
  /**
    * Returns a new Observable which first yields values from this Observable,
    * then yields values from the next Observable. This is useful for chaining
    * together Observables of finite length.
    */
  def concat[U](next: RelayObservable[U]): RelayObservable[T | U] = js.native
  /**
    * Returns a new Observable which returns the same values as this one, but
    * modified so that the provided Observer is called to perform a side-effects
    * for all events emitted by the source.
    *
    * Any errors that are thrown in the side-effect Observer are unhandled, and
    * do not affect the source Observable or its Observer.
    *
    * This is useful for when debugging your Observables or performing other
    * side-effects such as logging or performance monitoring.
    */
  def `do`(observer: Observer[T]): RelayObservable[T] = js.native
  /**
    * Returns a new Observable which returns the same values as this one, but
    * modified so that the finally callback is performed after completion,
    * whether normal or due to error or unsubscription.
    *
    * This is useful for cleanup such as resource finalization.
    */
  def `finally`(fn: js.Function0[_]): RelayObservable[T] = js.native
  /**
    * Returns a new Observable which is identical to this one, unless this
    * Observable completes before yielding any values, in which case the new
    * Observable will yield the values from the alternate Observable.
    *
    * If this Observable does yield values, the alternate is never subscribed to.
    *
    * This is useful for scenarios where values may come from multiple sources
    * which should be tried in order, i.e. from a cache before a network.
    */
  def ifEmpty[U](alternate: RelayObservable[U]): RelayObservable[T | U] = js.native
  /**
    * Returns a new Observerable where each value has been transformed by
    * the mapping function.
    */
  def map[U](fn: js.Function1[/* value */ T, U]): RelayObservable[U] = js.native
  /**
    * Returns a new Observable where each value is replaced with a new Observable
    * by the mapping function, the results of which returned as a single
    * merged Observable.
    */
  def mergeMap[U](fn: js.Function1[/* value */ T, ObservableFromValue[U]]): RelayObservable[U] = js.native
  /**
    * Returns a new Observable which first mirrors this Observable, then when it
    * completes, waits for `pollInterval` milliseconds before re-subscribing to
    * this Observable again, looping in this manner until unsubscribed.
    *
    * The returned Observable never completes.
    */
  def poll(pollInterval: Double): RelayObservable[T] = js.native
  /**
    * Returns a Promise which resolves when this Observable yields a first value
    * or when it completes with no value.
    */
  def toPromise(): js.Promise[js.UndefOr[T]] = js.native
}

/* static members */
@JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable")
@js.native
object RelayObservable extends js.Object {
  def create[V](source: Source[V]): RelayObservable[V] = js.native
  /**
    * Accepts various kinds of data sources, and always returns a RelayObservable
    * useful for accepting the result of a user-provided FetchFunction.
    */
  def from[V](obj: ObservableFromValue[V]): RelayObservable[V] = js.native
  /**
    * When an emitted error event is not handled by an Observer, it is reported
    * to the host environment (what the ESObservable spec refers to as
    * "HostReportErrors()").
    *
    * The default implementation in development rethrows thrown errors, and
    * logs emitted error events to the console, while in production does nothing
    * (swallowing unhandled errors).
    *
    * Called during application initialization, this method allows
    * application-specific handling of unhandled errors. Allowing, for example,
    * integration with error logging or developer tools.
    *
    * A second parameter `isUncaughtThrownError` is true when the unhandled error
    * was thrown within an Observer handler, and false when the unhandled error
    * was an unhandled emitted event.
    *
    *  - Uncaught thrown errors typically represent avoidable errors thrown from
    *    application code, which should be handled with a try/catch block, and
    *    usually have useful stack traces.
    *
    *  - Unhandled emitted event errors typically represent unavoidable events in
    *    application flow such as network failure, and may not have useful
    *    stack traces.
    */
  def onUnhandledError(callback: js.Function2[/* error */ Error, /* isUncaughtThrownError */ Boolean, Unit]): Unit = js.native
}

