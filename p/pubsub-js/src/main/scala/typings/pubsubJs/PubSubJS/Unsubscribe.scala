package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribe extends js.Object {
  def unsubscribe(tokenOrFunction: js.Any): js.Any
}

object Unsubscribe {
  @scala.inline
  def apply(unsubscribe: js.Any => js.Any): Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[Unsubscribe]
  }
}

