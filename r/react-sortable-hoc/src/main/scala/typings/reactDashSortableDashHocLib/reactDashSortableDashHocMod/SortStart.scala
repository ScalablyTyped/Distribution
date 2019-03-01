package typings
package reactDashSortableDashHocLib.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortStart extends js.Object {
  var collection: Offset
  var index: scala.Double
  var node: reactLib.Element
}

object SortStart {
  @scala.inline
  def apply(collection: Offset, index: scala.Double, node: reactLib.Element): SortStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[SortStart]
  }
}

