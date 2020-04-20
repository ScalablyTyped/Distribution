package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  def complete(): Unit
  def next(props: T): Unit
}

object Observer {
  @scala.inline
  def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T]]
  }
}

