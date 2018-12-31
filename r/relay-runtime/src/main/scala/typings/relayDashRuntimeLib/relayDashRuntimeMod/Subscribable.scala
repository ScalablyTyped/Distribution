package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Subscription
}

