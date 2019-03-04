package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNodeIterator extends js.Object {
  def hasNext(): scala.Boolean
  def next(): XMLNode
}

object XMLNodeIterator {
  @scala.inline
  def apply(hasNext: js.Function0[scala.Boolean], next: js.Function0[XMLNode]): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext, next = next)
  
    __obj.asInstanceOf[XMLNodeIterator]
  }
}

