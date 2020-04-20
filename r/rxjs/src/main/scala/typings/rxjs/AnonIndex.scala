package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[T] extends js.Object {
  var index: Double
  var keys: js.Array[String]
  var obj: js.Object
  var subscriber: Subscriber[js.Tuple2[String, T]]
  var subscription: Subscription
}

object AnonIndex {
  @scala.inline
  def apply[T](
    index: Double,
    keys: js.Array[String],
    obj: js.Object,
    subscriber: Subscriber[js.Tuple2[String, T]],
    subscription: Subscription
  ): AnonIndex[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[T]]
  }
}

