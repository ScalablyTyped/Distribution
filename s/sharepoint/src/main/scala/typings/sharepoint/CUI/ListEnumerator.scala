package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnumerator[T] extends js.Object {
  def get_current(): T
  def moveNext(): Boolean
  def movePrevious(): Boolean
  def reset(): scala.Unit
}

object ListEnumerator {
  @scala.inline
  def apply[T](
    get_current: () => T,
    moveNext: () => Boolean,
    movePrevious: () => Boolean,
    reset: () => scala.Unit
  ): ListEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), movePrevious = js.Any.fromFunction0(movePrevious), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ListEnumerator[T]]
  }
}

