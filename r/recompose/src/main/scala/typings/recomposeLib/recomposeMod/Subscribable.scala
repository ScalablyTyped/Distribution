package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Subscription
}

object Subscribable {
  @scala.inline
  def apply[T](subscribe: js.Function1[Observer[T], Subscription]): Subscribable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[Subscribable[T]]
  }
}

