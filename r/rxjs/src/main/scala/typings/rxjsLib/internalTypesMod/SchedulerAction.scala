package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerAction[T]
  extends rxjsLib.internalSubscriptionMod.Subscription {
  def schedule(): rxjsLib.internalSubscriptionMod.Subscription = js.native
  def schedule(state: T): rxjsLib.internalSubscriptionMod.Subscription = js.native
  def schedule(state: T, delay: scala.Double): rxjsLib.internalSubscriptionMod.Subscription = js.native
}

