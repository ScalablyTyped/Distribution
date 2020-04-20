package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNodeIterator extends js.Object {
  def hasNext(): Boolean
  def next(): XMLNode
}

object XMLNodeIterator {
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => XMLNode): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[XMLNodeIterator]
  }
}

