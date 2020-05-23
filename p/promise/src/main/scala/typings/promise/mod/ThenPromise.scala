package typings.promise.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait ThenPromise[T] extends js.Object {
  /**
    * Attaches a callback for only the rejection of the ThenPromise.
    * @param onrejected The callback to execute when the ThenPromise is rejected.
    * @returns A ThenPromise for the completion of the callback.
    */
  def `catch`[TResult](): ThenPromise[T | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]]): ThenPromise[T | TResult] = js.native
  // Extensions specific to then/promise
  /**
    * Attaches callbacks for the resolution and/or rejection of the ThenPromise, without returning a new promise.
    * @param onfulfilled The callback to execute when the ThenPromise is resolved.
    * @param onrejected The callback to execute when the ThenPromise is rejected.
    */
  def done(): Unit = js.native
  def done(onfulfilled: js.Function1[/* value */ T, _]): Unit = js.native
  def done(onfulfilled: js.Function1[/* value */ T, _], onrejected: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  def done(onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  def nodeify(): ThenPromise[T] = js.native
  def nodeify(callback: js.Function2[/* err */ Error, /* value */ T, Unit]): Unit = js.native
  /**
    * Calls a node.js style callback.  If none is provided, the promise is returned.
    */
  def nodeify(callback: Unit): ThenPromise[T] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the ThenPromise.
    * @param onfulfilled The callback to execute when the ThenPromise is resolved.
    * @param onrejected The callback to execute when the ThenPromise is rejected.
    * @returns A ThenPromise for the completion of which ever callback is executed.
    */
  def `then`[TResult1, TResult2](): ThenPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]]): ThenPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]
  ): ThenPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): ThenPromise[TResult1 | TResult2] = js.native
}

