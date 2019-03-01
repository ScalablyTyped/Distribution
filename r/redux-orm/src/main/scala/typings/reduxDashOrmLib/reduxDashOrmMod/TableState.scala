package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState[Item, Meta] extends js.Object {
  var items: js.Array[java.lang.String]
  var itemsById: org.scalablytyped.runtime.StringDictionary[Item]
  var meta: Meta
}

object TableState {
  @scala.inline
  def apply[Item, Meta](
    items: js.Array[java.lang.String],
    itemsById: org.scalablytyped.runtime.StringDictionary[Item],
    meta: Meta
  ): TableState[Item, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("itemsById")(itemsById)
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableState[Item, Meta]]
  }
}

