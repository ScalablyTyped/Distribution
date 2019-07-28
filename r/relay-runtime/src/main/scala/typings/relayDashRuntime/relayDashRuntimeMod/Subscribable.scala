package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Subscription = js.native
  def subscribe(observer: Sink[T]): Subscription = js.native
}

