package typings.rxLiteTesting.Rx

import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded]
}

object MockObserver {
  @scala.inline
  def apply[T](checked: () => Observer[_], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObserver[T]]
  }
}

