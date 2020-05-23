package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCollection[T] extends IEnumerable[T] {
  def get_count(): Double
  def itemAtIndex(index: Double): T
}

object BaseCollection {
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T], get_count: () => Double, itemAtIndex: Double => T): BaseCollection[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), itemAtIndex = js.Any.fromFunction1(itemAtIndex))
    __obj.asInstanceOf[BaseCollection[T]]
  }
}

