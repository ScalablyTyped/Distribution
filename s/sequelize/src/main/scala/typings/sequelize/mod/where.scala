package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait where extends js.Object {
  var attribute: js.Object
  var comparator: js.UndefOr[String] = js.undefined
  var logic: String | js.Object
}

object where {
  @scala.inline
  def apply(attribute: js.Object, logic: String | js.Object, comparator: String = null): where = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], logic = logic.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[where]
  }
}

