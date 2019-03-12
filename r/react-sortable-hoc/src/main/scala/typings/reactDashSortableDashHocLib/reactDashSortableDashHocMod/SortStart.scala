package typings
package reactDashSortableDashHocLib.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortStart extends js.Object {
  var collection: Offset
  var index: scala.Double
  var node: stdLib.Element
}

object SortStart {
  @scala.inline
  def apply(collection: Offset, index: scala.Double, node: stdLib.Element): SortStart = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], index = index, node = node)
  
    __obj.asInstanceOf[SortStart]
  }
}

