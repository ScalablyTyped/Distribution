package typings.prex.outLibCancellationMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancellationToken")
@js.native
class CancellationToken () extends Cancelable {
  var _signal: js.UndefOr[js.Any] = js.native
  var _source: js.Any = js.native
  /**
    * Gets a value indicating whether the underlying source can be canceled.
    */
  val canBeCanceled: Boolean = js.native
  /**
    * Gets a value indicating whether cancellation has been requested.
    */
  val cancellationRequested: Boolean = js.native
  /**
    * Registers a callback to execute when cancellation is requested.
    *
    * @param callback The callback to register.
    */
  def register(callback: js.Function0[Unit]): CancellationTokenRegistration = js.native
  /**
    * Throws a CancelError if cancellation has been requested.
    */
  def throwIfCancellationRequested(): Unit = js.native
}

/* static members */
@JSImport("prex/out/lib/cancellation", "CancellationToken")
@js.native
object CancellationToken extends js.Object {
  /**
    * A token that is already canceled.
    */
  val canceled: CancellationToken = js.native
  /**
    * A token which will never be canceled.
    */
  val none: CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def all(tokens: Iterable[CancellationToken | Cancelable]): CancellationToken = js.native
  def from(cancelable: Cancelable): CancellationToken = js.native
  def from(cancelable: AbortSignalLike): CancellationToken = js.native
  /**
    * Adapts a CancellationToken-like primitive from a different library.
    */
  def from(cancelable: CancellationToken): CancellationToken = js.native
  def from(cancelable: VSCodeCancellationTokenLike): CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def race(tokens: Iterable[CancellationToken | Cancelable]): CancellationToken = js.native
}

