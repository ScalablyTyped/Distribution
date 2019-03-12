package typings
package rxjsLib.internalOperatorsGroupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCountSubscription extends js.Object {
  var attemptedToUnsubscribe: scala.Boolean
  var closed: scala.Boolean
  var count: scala.Double
  def unsubscribe(): scala.Unit
}

object RefCountSubscription {
  @scala.inline
  def apply(
    attemptedToUnsubscribe: scala.Boolean,
    closed: scala.Boolean,
    count: scala.Double,
    unsubscribe: () => scala.Unit
  ): RefCountSubscription = {
    val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe, closed = closed, count = count, unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[RefCountSubscription]
  }
}

