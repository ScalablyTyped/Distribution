package typings.rxjs.anon

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[T] extends js.Object {
  var index: Double = js.native
  var keys: js.Array[String] = js.native
  var obj: js.Object = js.native
  var subscriber: Subscriber[js.Tuple2[String, T]] = js.native
  var subscription: Subscription = js.native
}

object Index {
  @scala.inline
  def apply[T](
    index: Double,
    keys: js.Array[String],
    obj: js.Object,
    subscriber: Subscriber[js.Tuple2[String, T]],
    subscription: Subscription
  ): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setObj(value: js.Object): Self = this.set("obj", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriber(value: Subscriber[js.Tuple2[String, T]]): Self = this.set("subscriber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
  
}

