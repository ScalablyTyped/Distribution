package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Subscription
}

object Subscribable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => Subscription): Subscribable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Subscribable[T]]
  }
}

