package typings.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait Observer[T] extends js.Object {
  def checked(): Observer[_]
}

object Observer {
  @scala.inline
  def apply[T](checked: () => Observer[_]): Observer[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked))
  
    __obj.asInstanceOf[Observer[T]]
  }
}

