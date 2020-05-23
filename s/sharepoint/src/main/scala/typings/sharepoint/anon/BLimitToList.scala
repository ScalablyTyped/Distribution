package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLimitToList extends js.Object {
  var bLimitToList: Boolean
  var id: String
  var items: js.Array[_]
}

object BLimitToList {
  @scala.inline
  def apply(bLimitToList: Boolean, id: String, items: js.Array[_]): BLimitToList = {
    val __obj = js.Dynamic.literal(bLimitToList = bLimitToList.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLimitToList]
  }
}

