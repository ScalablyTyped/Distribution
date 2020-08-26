package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator extends js.Object {
  var comparator: js.Any = js.native
  var filterType: TEXT = js.native
  var filterVal: js.Any = js.native
}

object Comparator {
  @scala.inline
  def apply(comparator: js.Any, filterType: TEXT, filterVal: js.Any): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any], filterVal = filterVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator] (val x: Self) extends AnyVal {
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
    def setComparator(value: js.Any): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterType(value: TEXT): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterVal(value: js.Any): Self = this.set("filterVal", value.asInstanceOf[js.Any])
  }
  
}

