package typings.stompjs.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var id: String
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(id: String, unsubscribe: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Subscription]
  }
}

