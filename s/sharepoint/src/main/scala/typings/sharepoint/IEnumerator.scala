package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerator[T] extends js.Object {
  def get_current(): T
  def moveNext(): Boolean
  def reset(): Unit
}

object IEnumerator {
  @scala.inline
  def apply[T](get_current: () => T, moveNext: () => Boolean, reset: () => Unit): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

