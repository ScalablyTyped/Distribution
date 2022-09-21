package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterClearTemplateOptions extends StObject {
  
  var field: String
  
  def filterClearCallback(): Unit
  
  var filterModel: ColumnFilterModelOptions
}
object ColumnFilterClearTemplateOptions {
  
  inline def apply(field: String, filterClearCallback: () => Unit, filterModel: ColumnFilterModelOptions): ColumnFilterClearTemplateOptions = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], filterClearCallback = js.Any.fromFunction0(filterClearCallback), filterModel = filterModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterClearTemplateOptions]
  }
  
  extension [Self <: ColumnFilterClearTemplateOptions](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilterClearCallback(value: () => Unit): Self = StObject.set(x, "filterClearCallback", js.Any.fromFunction0(value))
    
    inline def setFilterModel(value: ColumnFilterModelOptions): Self = StObject.set(x, "filterModel", value.asInstanceOf[js.Any])
  }
}
