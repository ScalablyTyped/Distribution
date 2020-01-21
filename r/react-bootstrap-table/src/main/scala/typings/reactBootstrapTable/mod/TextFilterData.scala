package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFilterData extends FilterValue {
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter
  var value: String
}

object TextFilterData {
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFilterData]
  }
}

