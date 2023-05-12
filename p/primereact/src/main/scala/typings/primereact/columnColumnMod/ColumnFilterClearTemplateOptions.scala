package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterClearTemplateOptions extends StObject {
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * Callback function to clear the filters.
    */
  def filterClearCallback(): Unit
  
  /**
    * Object containing column filter model options.
    */
  var filterModel: ColumnFilterModelOptions
}
object ColumnFilterClearTemplateOptions {
  
  inline def apply(field: String, filterClearCallback: () => Unit, filterModel: ColumnFilterModelOptions): ColumnFilterClearTemplateOptions = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], filterClearCallback = js.Any.fromFunction0(filterClearCallback), filterModel = filterModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterClearTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterClearTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilterClearCallback(value: () => Unit): Self = StObject.set(x, "filterClearCallback", js.Any.fromFunction0(value))
    
    inline def setFilterModel(value: ColumnFilterModelOptions): Self = StObject.set(x, "filterModel", value.asInstanceOf[js.Any])
  }
}
