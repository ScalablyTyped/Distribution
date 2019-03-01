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
  def apply(closed: scala.Boolean, unsubscribe: js.Function0[scala.Unit]): SubscriptionLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[SubscriptionLike]
  }
}

