package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  val closed: scala.Boolean
  def unsubscribe(): scala.Unit
}

object Subscription {
  @scala.inline
  def apply(closed: scala.Boolean, unsubscribe: () => scala.Unit): Subscription = {
    val __obj = js.Dynamic.literal(closed = closed, unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Subscription]
  }
}

