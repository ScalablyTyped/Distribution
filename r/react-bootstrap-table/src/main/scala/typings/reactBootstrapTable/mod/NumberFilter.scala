package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Comparator
import typings.reactBootstrapTable.anon.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFilter extends _Filter {
  
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Comparator] = js.native
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Number filter comparators
    */
  var numberComparators: js.UndefOr[js.Array[FilterComparator]] = js.native
  
  /**
    * List of number options that can be selected, if the number field is a select dropdown instead of a text edit.
    */
  var options: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[Number] = js.native
  
  /**
    * Filter type must be 'NumberFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter = js.native
  
  /**
    * Specify that the comparator field MUST have a comparator selected.
    */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify that the value field MUST have a number value specified.
    */
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.native
  
  /**
    * If this is a select number field, disable the empty option in the dropdown.
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}
object NumberFilter {
  
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilter]
  }
  
  @scala.inline
  implicit class NumberFilterOps[Self <: NumberFilter] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: Comparator): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setNumberComparatorsVarargs(value: FilterComparator*): Self = this.set("numberComparators", js.Array(value :_*))
    
    @scala.inline
    def setNumberComparators(value: js.Array[FilterComparator]): Self = this.set("numberComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberComparators: Self = this.set("numberComparators", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Double*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Double]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setStyle(value: Number): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWithoutEmptyComparatorOption(value: Boolean): Self = this.set("withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutEmptyComparatorOption: Self = this.set("withoutEmptyComparatorOption", js.undefined)
    
    @scala.inline
    def setWithoutEmptyNumberOption(value: Boolean): Self = this.set("withoutEmptyNumberOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutEmptyNumberOption: Self = this.set("withoutEmptyNumberOption", js.undefined)
    
    @scala.inline
    def setWithoutEmptyOption(value: Boolean): Self = this.set("withoutEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutEmptyOption: Self = this.set("withoutEmptyOption", js.undefined)
  }
}
