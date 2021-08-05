package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ComparatorDate
import typings.reactBootstrapTable.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilter
  extends StObject
     with _Filter {
  
  /**
    * Date filter comparators
    */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Date] = js.undefined
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[ComparatorDate] = js.undefined
  
  /**
    * Filter type must be 'DateFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter
}
object DateFilter {
  
  inline def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DateFilter")
    __obj.asInstanceOf[DateFilter]
  }
  
  extension [Self <: DateFilter](x: Self) {
    
    inline def setDateComparators(value: js.Array[FilterComparator]): Self = StObject.set(x, "dateComparators", value.asInstanceOf[js.Any])
    
    inline def setDateComparatorsUndefined: Self = StObject.set(x, "dateComparators", js.undefined)
    
    inline def setDateComparatorsVarargs(value: FilterComparator*): Self = StObject.set(x, "dateComparators", js.Array(value :_*))
    
    inline def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setStyle(value: ComparatorDate): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
