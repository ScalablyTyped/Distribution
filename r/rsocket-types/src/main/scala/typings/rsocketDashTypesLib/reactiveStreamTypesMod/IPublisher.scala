package typings
package rsocketDashTypesLib.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublisher[T] extends js.Object {
  def map[R](fn: js.Function1[/* data */ T, R]): IPublisher[R] = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(subscriber: stdLib.Partial[ISubscriber[T]]): scala.Unit = js.native
}

