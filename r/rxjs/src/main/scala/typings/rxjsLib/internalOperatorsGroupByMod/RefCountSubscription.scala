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
    unsubscribe: js.Function0[scala.Unit]
  ): RefCountSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attemptedToUnsubscribe")(attemptedToUnsubscribe)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[RefCountSubscription]
  }
}

