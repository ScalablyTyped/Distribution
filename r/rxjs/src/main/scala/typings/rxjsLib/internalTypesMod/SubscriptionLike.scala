package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionLike extends Unsubscribable {
  val closed: scala.Boolean
}

object SubscriptionLike {
  @scala.inline
  def apply(closed: scala.Boolean, unsubscribe: () => scala.Unit): SubscriptionLike = {
    val __obj = js.Dynamic.literal(closed = closed, unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[SubscriptionLike]
  }
}

