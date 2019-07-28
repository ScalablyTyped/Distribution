package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLimitToList extends js.Object {
  var bLimitToList: Boolean
  var id: String
  var items: js.Array[_]
}

object Anon_BLimitToList {
  @scala.inline
  def apply(bLimitToList: Boolean, id: String, items: js.Array[_]): Anon_BLimitToList = {
    val __obj = js.Dynamic.literal(bLimitToList = bLimitToList, id = id, items = items)
  
    __obj.asInstanceOf[Anon_BLimitToList]
  }
}

