package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "CancellationToken")
@js.native
class CancellationToken ()
  extends prexLib.outLibCancellationMod.CancellationToken

/* static members */
@JSImport("prex", "CancellationToken")
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
  def all(
    tokens: stdLib.Iterable[
      prexLib.outLibCancellationMod.CancellationToken | atEsfxCancelableLib.distMod.Cancelable
    ]
  ): prexLib.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: atEsfxCancelableLib.distMod.Cancelable): prexLib.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: prexLib.outLibCancellationMod.AbortSignalLike): prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * Adapts a CancellationToken-like primitive from a different library.
    */
  def from(cancelable: prexLib.outLibCancellationMod.CancellationToken): prexLib.outLibCancellationMod.CancellationToken = js.native
  def from(cancelable: prexLib.outLibCancellationMod.VSCodeCancellationTokenLike): prexLib.outLibCancellationMod.CancellationToken = js.native
  /**
    * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
    * @param tokens An iterable of CancellationToken objects.
    */
  def race(
    tokens: stdLib.Iterable[
      prexLib.outLibCancellationMod.CancellationToken | atEsfxCancelableLib.distMod.Cancelable
    ]
  ): prexLib.outLibCancellationMod.CancellationToken = js.native
}

