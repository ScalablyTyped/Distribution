package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RelayObservable")
@js.native
class RelayObservable[T] protected () extends Subscribable[T] {
  def this(source: Source[T]) = this()
  @JSName("_source")
  var _source_Original: Source[T] = js.native
  def _source[T](): js.Any = js.native
  /**
       * Returns a new Observable where each value is replaced with a new Observable
       * by the mapping function, the results of which returned as a single
       * concattenated Observable.
       */
  def concatMap[U](fn: js.Function1[/* thing */ T, ObservableFromValue[U]]): RelayObservable[U] = js.native
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
  def map[U](fn: js.Function1[/* thing */ T, U]): RelayObservable[U] = js.native
  /**
       * Returns a new Observable which first mirrors this Observable, then when it
       * completes, waits for `pollInterval` milliseconds before re-subscribing to
       * this Observable again, looping in this manner until unsubscribed.
       *
       * The returned Observable never completes.
       */
  def poll(pollInterval: scala.Double): RelayObservable[T] = js.native
  /* CompleteClass */
  override def subscribe(observer: Observer[T]): Subscription = js.native
  /**
       * Supports subscription of a legacy Relay Observer, returning a Disposable.
       */
  def subscribeLegacy(legacyObserver: LegacyObserver[T]): Disposable = js.native
  /**
       * Returns a Promise which resolves when this Observable yields a first value
       * or when it completes with no value.
       */
  def toPromise(): js.Promise[js.UndefOr[T | scala.Null]] = js.native
}

@JSImport("relay-runtime", "RelayObservable")
@js.native
object RelayObservable extends js.Object {
  /**
       * Accepts various kinds of data sources, and always returns a RelayObservable
       * useful for accepting the result of a user-provided FetchFunction.
       */
  def from[V](obj: relayDashRuntimeLib.relayDashRuntimeMod.ObservableFromValue[V]): relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V] = js.native
  /**
       * Creates a RelayObservable, given a function which expects a legacy
       * Relay Observer as the last argument and which returns a Disposable.
       *
       * To support migration to Observable, the function may ignore the
       * legacy Relay observer and directly return an Observable instead.
       */
  def fromLegacy[V](
    callback: js.Function1[
      /* legacyObserver */ relayDashRuntimeLib.relayDashRuntimeMod.LegacyObserver[V], 
      relayDashRuntimeLib.relayDashRuntimeMod.Disposable | relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V]
    ]
  ): relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V] = js.native
  /**
       * When an unhandled error is detected, it is reported to the host environment
       * (the ESObservable spec refers to this method as "HostReportErrors()").
       *
       * The default implementation in development builds re-throws errors in a
       * separate frame, and from production builds does nothing (swallowing
       * uncaught errors).
       *
       * Called during application initialization, this method allows
       * application-specific handling of uncaught errors. Allowing, for example,
       * integration with error logging or developer tools.
       */
  def onUnhandledError(callback: js.Function1[/* error */ stdLib.Error, _]): scala.Unit = js.native
}

