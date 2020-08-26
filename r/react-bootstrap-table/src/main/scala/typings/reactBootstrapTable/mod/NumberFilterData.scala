package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilterData extends FilterValue {
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter = js.native
  var value: NumberFilterValue = js.native
}

object NumberFilterData {
  @scala.inline
  def apply(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterData]
  }
  @scala.inline
  implicit class NumberFilterDataOps[Self <: NumberFilterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: NumberFilterValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

