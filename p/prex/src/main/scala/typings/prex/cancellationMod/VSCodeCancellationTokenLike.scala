package typings.prex.cancellationMod

import typings.prex.anon.Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: Boolean
  def onCancellationRequested(listener: js.Function0[_]): Dispose
}

object VSCodeCancellationTokenLike {
  @scala.inline
  def apply(isCancellationRequested: Boolean, onCancellationRequested: js.Function0[_] => Dispose): VSCodeCancellationTokenLike = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
    __obj.asInstanceOf[VSCodeCancellationTokenLike]
  }
}

