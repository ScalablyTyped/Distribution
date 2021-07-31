package typings.raygun.typesMod

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
  
  @scala.inline
  def apply(): MessageBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBuilderOptions]
  }
  
  @scala.inline
  implicit class MessageBuilderOptionsMutableBuilder[Self <: MessageBuilderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setInnerErrorFieldName(value: String): Self = StObject.set(x, "innerErrorFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerErrorFieldNameUndefined: Self = StObject.set(x, "innerErrorFieldName", js.undefined)
    
    @scala.inline
    def setReportColumnNumbers(value: Boolean): Self = StObject.set(x, "reportColumnNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportColumnNumbersUndefined: Self = StObject.set(x, "reportColumnNumbers", js.undefined)
    
    @scala.inline
    def setUseHumanStringForObject(value: Boolean): Self = StObject.set(x, "useHumanStringForObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHumanStringForObjectUndefined: Self = StObject.set(x, "useHumanStringForObject", js.undefined)
  }
}
