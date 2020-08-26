package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilterValue extends _FilterValueData {
  var comparator: FilterComparator = js.native
  var number: Double | String = js.native
}

object NumberFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, number: Double | String): NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterValue]
  }
  @scala.inline
  implicit class NumberFilterValueOps[Self <: NumberFilterValue] (val x: Self) extends AnyVal {
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
    def setComparator(value: FilterComparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double | String): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

