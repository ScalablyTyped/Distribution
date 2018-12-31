package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancellationToken")
@js.native
class CancellationToken () extends js.Object {
  var _source: js.Any = js.native
  /**
    * Gets a value indicating whether the underlying source can be canceled.
    */
  val canBeCanceled: scala.Boolean = js.native
  /**
    * Gets a value indicating whether cancellation has been requested.
    */
  val cancellationRequested: scala.Boolean = js.native
  /**
    * Registers a callback to execute when cancellation is requested.
    *
    * @param callback The callback to register.
    */
  def register(callback: js.Function0[scala.Unit]): CancellationTokenRegistration = js.native
  /**
    * Throws a CancelError if cancellation has been requested.
    */
  def throwIfCancellationRequested(): scala.Unit = js.native
}

@JSImport("prex/out/lib/cancellation", "CancellationToken")
@js.native
object CancellationToken extends js.Object {
  /**
    * A token that is already canceled.
    */
  val canceled: prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * A token which will never be canceled.
    */
  val none: prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def all(tokens: stdLib.Iterable[prexLib.outLibCancellationMod.CancellationToken]): prexLib.outLibCancellationMod.CancellationToken = js.native
  def from(token: prexLib.outLibCancellationMod.AbortSignalLike): prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * Adapts a CancellationToken-like primitive from a different library.
    */
  def from(token: prexLib.outLibCancellationMod.CancellationToken): prexLib.outLibCancellationMod.CancellationToken = js.native
  def from(token: prexLib.outLibCancellationMod.VSCodeCancellationTokenLike): prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def race(tokens: stdLib.Iterable[prexLib.outLibCancellationMod.CancellationToken]): prexLib.outLibCancellationMod.CancellationToken = js.native
}

