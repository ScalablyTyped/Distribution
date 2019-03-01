package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  var index: scala.Double
  var keys: js.Array[java.lang.String]
  var obj: js.Object
  var subscriber: rxjsLib.internalSubscriberMod.Subscriber[js.Tuple2[java.lang.String, T]]
  var subscription: rxjsLib.internalSubscriptionMod.Subscription
}

object Anon_Index {
  @scala.inline
  def apply[T](
    index: scala.Double,
    keys: js.Array[java.lang.String],
    obj: js.Object,
    subscriber: rxjsLib.internalSubscriberMod.Subscriber[js.Tuple2[java.lang.String, T]],
    subscription: rxjsLib.internalSubscriptionMod.Subscription
  ): Anon_Index[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("obj")(obj)
    __obj.updateDynamic("subscriber")(subscriber)
    __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

