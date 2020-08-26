package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  def subscribe(message: String, func: js.Function): String = js.native
  def subscribeOnce(message: String, func: js.Function): js.Any = js.native
}

object Subscribe {
  @scala.inline
  def apply(subscribe: (String, js.Function) => String, subscribeOnce: (String, js.Function) => js.Any): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), subscribeOnce = js.Any.fromFunction2(subscribeOnce))
    __obj.asInstanceOf[Subscribe]
  }
  @scala.inline
  implicit class SubscribeOps[Self <: Subscribe] (val x: Self) extends AnyVal {
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
    def setSubscribe(value: (String, js.Function) => String): Self = this.set("subscribe", js.Any.fromFunction2(value))
    @scala.inline
    def setSubscribeOnce(value: (String, js.Function) => js.Any): Self = this.set("subscribeOnce", js.Any.fromFunction2(value))
  }
  
}

