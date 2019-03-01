package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLimitToList extends js.Object {
  var bLimitToList: scala.Boolean
  var id: java.lang.String
  var items: js.Array[_]
}

object Anon_BLimitToList {
  @scala.inline
  def apply(bLimitToList: scala.Boolean, id: java.lang.String, items: js.Array[_]): Anon_BLimitToList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bLimitToList")(bLimitToList)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_BLimitToList]
  }
}

