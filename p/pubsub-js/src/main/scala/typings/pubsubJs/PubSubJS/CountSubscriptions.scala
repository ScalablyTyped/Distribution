package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountSubscriptions extends js.Object {
  def countSubscriptions(token: js.Any): Double = js.native
}

object CountSubscriptions {
  @scala.inline
  def apply(countSubscriptions: js.Any => Double): CountSubscriptions = {
    val __obj = js.Dynamic.literal(countSubscriptions = js.Any.fromFunction1(countSubscriptions))
    __obj.asInstanceOf[CountSubscriptions]
  }
  @scala.inline
  implicit class CountSubscriptionsOps[Self <: CountSubscriptions] (val x: Self) extends AnyVal {
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
    def setCountSubscriptions(value: js.Any => Double): Self = this.set("countSubscriptions", js.Any.fromFunction1(value))
  }
  
}

