package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait where extends js.Object {
  var attribute: js.Object
  var comparator: js.UndefOr[java.lang.String] = js.undefined
  var logic: java.lang.String | js.Object
}

object where {
  @scala.inline
  def apply(attribute: js.Object, logic: java.lang.String | js.Object, comparator: java.lang.String = null): where = {
    val __obj = js.Dynamic.literal(attribute = attribute, logic = logic.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    __obj.asInstanceOf[where]
  }
}

