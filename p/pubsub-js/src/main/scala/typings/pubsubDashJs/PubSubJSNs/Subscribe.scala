package typings.pubsubDashJs.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribe extends js.Object {
  def subscribe(message: js.Any, func: js.Function): js.Any
}

object Subscribe {
  @scala.inline
  def apply(subscribe: (js.Any, js.Function) => js.Any): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[Subscribe]
  }
}

