package typings.prex.prexMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "CancellationTokenSource")
@js.native
/**
  * Initializes a new instance of a CancellationTokenSource.
  *
  * @param linkedTokens An optional iterable of tokens to which to link this source.
  */
class CancellationTokenSource ()
  extends typings.prex.outLibCancellationMod.CancellationTokenSource {
  def this(linkedTokens: Iterable[typings.prex.outLibCancellationMod.CancellationToken | Cancelable]) = this()
}

