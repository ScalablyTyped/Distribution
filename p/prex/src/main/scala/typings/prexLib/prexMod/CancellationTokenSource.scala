package typings
package prexLib.prexMod

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
  extends prexLib.outLibCancellationMod.CancellationTokenSource {
  def this(linkedTokens: stdLib.Iterable[prexLib.outLibCancellationMod.CancellationToken]) = this()
}

