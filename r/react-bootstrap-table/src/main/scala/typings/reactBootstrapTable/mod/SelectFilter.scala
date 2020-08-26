package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectFilter extends _Filter {
  /**
    * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
    */
  var condition: js.UndefOr[FilterCondition] = js.native
  /**
    * Default value for the select filter.
    */
  var defaultValue: js.UndefOr[String | Double | Boolean] = js.native
  /**
    * Options for the filter select.
    */
  var options: SelectFilterOptionsType = js.native
  /**
    * Placeholder text to show in the filter.
    */
  var selectText: js.UndefOr[String] = js.native
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Filter type must be 'SelectFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter = js.native
  /**
    * Disable the empty option in the dropdown filter.
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}

object SelectFilter {
  @scala.inline
  def apply(
    options: SelectFilterOptionsType,
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  ): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilter]
  }
  @scala.inline
  implicit class SelectFilterOps[Self <: SelectFilter] (val x: Self) extends AnyVal {
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
    def setOptions(value: SelectFilterOptionsType): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: FilterCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setDefaultValue(value: String | Double | Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setSelectText(value: String): Self = this.set("selectText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectText: Self = this.set("selectText", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWithoutEmptyOption(value: Boolean): Self = this.set("withoutEmptyOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutEmptyOption: Self = this.set("withoutEmptyOption", js.undefined)
  }
  
}

