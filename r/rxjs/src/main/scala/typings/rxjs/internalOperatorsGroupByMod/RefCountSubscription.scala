package typings.rxjs.internalOperatorsGroupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCountSubscription extends js.Object {
  var attemptedToUnsubscribe: Boolean
  var closed: Boolean
  var count: Double
  def unsubscribe(): Unit
}

object RefCountSubscription {
  @scala.inline
  def apply(attemptedToUnsubscribe: Boolean, closed: Boolean, count: Double, unsubscribe: () => Unit): RefCountSubscription = {
    val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe, closed = closed, count = count, unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[RefCountSubscription]
  }
}

