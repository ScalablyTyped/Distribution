package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnComplete extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ typings.std.Error | Null, Unit]] = js.native
}

object OnComplete {
  @scala.inline
  def apply(): OnComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete]
  }
  @scala.inline
  implicit class OnCompleteOps[Self <: OnComplete] (val x: Self) extends AnyVal {
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
    def setOnComplete(value: /* arg */ typings.std.Error | Null => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
  }
  
}

