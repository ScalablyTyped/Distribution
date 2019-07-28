package typings.prex.prexMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.prex.outLibCancellationMod.AbortSignalLike
import typings.prex.outLibCancellationMod.VSCodeCancellationTokenLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "CancellationToken")
@js.native
class CancellationToken ()
  extends typings.prex.outLibCancellationMod.CancellationToken

/* static members */
@JSImport("prex", "CancellationToken")
@js.native
object CancellationToken extends js.Object {
  /**
    * A token that is already canceled.
    */
  val canceled: typings.prex.outLibCancellationMod.CancellationToken = js.native
  /**
    * A token which will never be canceled.
    */
  val none: typings.prex.outLibCancellationMod.CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def all(tokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]): typings.prex.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: Cancelable): typings.prex.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: AbortSignalLike): typings.prex.outLibCancellationMod.CancellationToken = js.native
  /**
    * Adapts a CancellationToken-like primitive from a different library.
    */
  def from(cancelable: typings.prex.outLibCancellationMod.CancellationToken): typings.prex.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: VSCodeCancellationTokenLike): typings.prex.outLibCancellationMod.CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def race(tokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]): typings.prex.outLibCancellationMod.CancellationToken = js.native
}

