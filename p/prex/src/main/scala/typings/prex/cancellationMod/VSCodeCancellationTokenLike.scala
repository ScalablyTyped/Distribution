package typings.prex.cancellationMod

import typings.prex.anon.Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: Boolean = js.native
  def onCancellationRequested(listener: js.Function0[_]): Dispose = js.native
}

object VSCodeCancellationTokenLike {
  @scala.inline
  def apply(isCancellationRequested: Boolean, onCancellationRequested: js.Function0[_] => Dispose): VSCodeCancellationTokenLike = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any], onCancellationRequested = js.Any.fromFunction1(onCancellationRequested))
    __obj.asInstanceOf[VSCodeCancellationTokenLike]
  }
  @scala.inline
  implicit class VSCodeCancellationTokenLikeOps[Self <: VSCodeCancellationTokenLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = this.set("isCancellationRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCancellationRequested(value: js.Function0[_] => Dispose): Self = this.set("onCancellationRequested", js.Any.fromFunction1(value))
  }
  
}

