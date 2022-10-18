package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBuilderOptions extends StObject {
  
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var innerErrorFieldName: js.UndefOr[String] = js.undefined
  
  var reportColumnNumbers: js.UndefOr[Boolean] = js.undefined
  
  var useHumanStringForObject: js.UndefOr[Boolean] = js.undefined
}
object MessageBuilderOptions {
  
  inline def apply(): MessageBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBuilderOptions]
  }
  
  extension [Self <: MessageBuilderOptions](x: Self) {
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setInnerErrorFieldName(value: String): Self = StObject.set(x, "innerErrorFieldName", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorFieldNameUndefined: Self = StObject.set(x, "innerErrorFieldName", js.undefined)
    
    inline def setReportColumnNumbers(value: Boolean): Self = StObject.set(x, "reportColumnNumbers", value.asInstanceOf[js.Any])
    
    inline def setReportColumnNumbersUndefined: Self = StObject.set(x, "reportColumnNumbers", js.undefined)
    
    inline def setUseHumanStringForObject(value: Boolean): Self = StObject.set(x, "useHumanStringForObject", value.asInstanceOf[js.Any])
    
    inline def setUseHumanStringForObjectUndefined: Self = StObject.set(x, "useHumanStringForObject", js.undefined)
  }
}
