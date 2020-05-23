package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribe extends js.Object {
  def subscribe(message: String, func: js.Function): String
  def subscribeOnce(message: String, func: js.Function): js.Any
}

object Subscribe {
  @scala.inline
  def apply(subscribe: (String, js.Function) => String, subscribeOnce: (String, js.Function) => js.Any): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), subscribeOnce = js.Any.fromFunction2(subscribeOnce))
    __obj.asInstanceOf[Subscribe]
  }
}

