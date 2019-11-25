package typings.rxjs

import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  var index: Double
  var keys: js.Array[String]
  var obj: js.Object
  var subscriber: Subscriber[js.Tuple2[String, T]]
  var subscription: Subscription
}

object Anon_Index {
  @scala.inline
  def apply[T](
    index: Double,
    keys: js.Array[String],
    obj: js.Object,
    subscriber: Subscriber[js.Tuple2[String, T]],
    subscription: Subscription
  ): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

