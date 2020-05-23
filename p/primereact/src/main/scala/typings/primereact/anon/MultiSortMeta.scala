package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortMeta extends js.Object {
  var multiSortMeta: js.Any
  var sortField: String
  var sortOrder: Double
}

object MultiSortMeta {
  @scala.inline
  def apply(multiSortMeta: js.Any, sortField: String, sortOrder: Double): MultiSortMeta = {
    val __obj = js.Dynamic.literal(multiSortMeta = multiSortMeta.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortMeta]
  }
}

