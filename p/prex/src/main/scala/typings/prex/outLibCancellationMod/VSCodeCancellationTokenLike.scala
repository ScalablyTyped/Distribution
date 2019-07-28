package typings.prex.outLibCancellationMod

import typings.prex.Anon_Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: Boolean
  def onCancellationRequested(listener: js.Function0[_]): Anon_Dispose
}

object VSCodeCancellationTokenLike {
  @scala.inline
  def apply(isCancellationRequested: Boolean, onCancellationRequested: js.Function0[_] => Anon_Dispose): VSCodeCancellationTokenLike = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested, onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
  
    __obj.asInstanceOf[VSCodeCancellationTokenLike]
  }
}

