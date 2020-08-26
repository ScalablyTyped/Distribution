package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ComparatorDate
import typings.reactBootstrapTable.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter extends _Filter {
  /**
    * Date filter comparators
    */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.native
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[ComparatorDate] = js.native
  /**
    * Filter type must be 'DateFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter = js.native
}

object DateFilter {
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
  @scala.inline
  implicit class DateFilterOps[Self <: DateFilter] (val x: Self) extends AnyVal {
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
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateComparatorsVarargs(value: FilterComparator*): Self = this.set("dateComparators", js.Array(value :_*))
    @scala.inline
    def setDateComparators(value: js.Array[FilterComparator]): Self = this.set("dateComparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateComparators: Self = this.set("dateComparators", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setStyle(value: ComparatorDate): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

