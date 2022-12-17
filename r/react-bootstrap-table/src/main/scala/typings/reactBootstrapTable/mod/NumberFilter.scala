package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Comparator
import typings.reactBootstrapTable.anon.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFilter
  extends StObject
     with _Filter {
  
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Comparator] = js.undefined
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Number filter comparators
    */
  var numberComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  
  /**
    * List of number options that can be selected, if the number field is a select dropdown instead of a text edit.
    */
  var options: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[Number] = js.undefined
  
  /**
    * Filter type must be 'NumberFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter
  
  /**
    * Specify that the comparator field MUST have a comparator selected.
    */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify that the value field MUST have a number value specified.
    */
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this is a select number field, disable the empty option in the dropdown.
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}
object NumberFilter {
  
  inline def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberFilter")
    __obj.asInstanceOf[NumberFilter]
  }
  
  extension [Self <: NumberFilter](x: Self) {
    
    inline def setDefaultValue(value: Comparator): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setNumberComparators(value: js.Array[FilterComparator]): Self = StObject.set(x, "numberComparators", value.asInstanceOf[js.Any])
    
    inline def setNumberComparatorsUndefined: Self = StObject.set(x, "numberComparators", js.undefined)
    
    inline def setNumberComparatorsVarargs(value: FilterComparator*): Self = StObject.set(x, "numberComparators", js.Array(value*))
    
    inline def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: Number): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
    
    inline def setWithoutEmptyNumberOption(value: Boolean): Self = StObject.set(x, "withoutEmptyNumberOption", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyNumberOptionUndefined: Self = StObject.set(x, "withoutEmptyNumberOption", js.undefined)
    
    inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
  }
}
