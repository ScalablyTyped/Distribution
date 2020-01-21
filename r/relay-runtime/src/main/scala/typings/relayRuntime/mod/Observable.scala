package typings.relayRuntime.mod

import typings.relayRuntime.relayObservableMod.ObservableFromValue
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayObservableMod.Source
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Observable")
@js.native
class Observable[T] protected () extends RelayObservable[T] {
  // Use RelayObservable.create(source);
  protected def this(source: scala.Nothing) = this()
}

/* static members */
@JSImport("relay-runtime", "Observable")
@js.native
object Observable extends js.Object {
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

