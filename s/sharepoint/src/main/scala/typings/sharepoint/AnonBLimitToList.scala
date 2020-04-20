package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBLimitToList extends js.Object {
  var bLimitToList: Boolean
  var id: String
  var items: js.Array[_]
}

object AnonBLimitToList {
  @scala.inline
  def apply(bLimitToList: Boolean, id: String, items: js.Array[_]): AnonBLimitToList = {
    val __obj = js.Dynamic.literal(bLimitToList = bLimitToList.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBLimitToList]
  }
}

