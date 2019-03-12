package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: scala.Boolean
  def onCancellationRequested(listener: js.Function0[_]): prexLib.Anon_Dispose
}

object VSCodeCancellationTokenLike {
  @scala.inline
  def apply(
    isCancellationRequested: scala.Boolean,
    onCancellationRequested: js.Function0[_] => prexLib.Anon_Dispose
  ): VSCodeCancellationTokenLike = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested, onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
  
    __obj.asInstanceOf[VSCodeCancellationTokenLike]
  }
}

