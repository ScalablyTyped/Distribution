package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeArg[FormFields] extends js.Object {
  def subscribe(data: FormFields): Unit = js.native
}

object SubscribeArg {
  @scala.inline
  def apply[FormFields](subscribe: FormFields => Unit): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
  @scala.inline
  implicit class SubscribeArgOps[Self <: SubscribeArg[_], FormFields] (val x: Self with SubscribeArg[FormFields]) extends AnyVal {
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
    def setSubscribe(value: FormFields => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

