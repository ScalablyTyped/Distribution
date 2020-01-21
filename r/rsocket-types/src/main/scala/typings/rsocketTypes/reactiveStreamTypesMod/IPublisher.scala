package typings.rsocketTypes.reactiveStreamTypesMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublisher[T] extends js.Object {
  def map[R](fn: js.Function1[/* data */ T, R]): IPublisher[R] = js.native
  def subscribe(): Unit = js.native
  def subscribe(subscriber: Partial[ISubscriber[T]]): Unit = js.native
}

