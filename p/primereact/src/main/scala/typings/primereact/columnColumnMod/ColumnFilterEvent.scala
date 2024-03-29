package typings.primereact.columnColumnMod

import typings.primereact.anon.FilterField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link ColumnProps.filterFunction}
  * @event
  */
trait ColumnFilterEvent extends StObject {
  
  /**
    * Object containing metadata for the current column, including filter metadata, field name, and column properties.
    */
  var column: FilterField
  
  /**
    * Object containing filter metadata for all columns.
    */
  var filters: ColumnFilterMeta
  
  /**
    * Additional properties passed to the filter function.
    */
  var props: Any
  
  /**
    * Data of the current row."
    */
  var rowData: Any
}
object ColumnFilterEvent {
  
  inline def apply(column: FilterField, filters: ColumnFilterMeta, props: Any, rowData: Any): ColumnFilterEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterEvent] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: FilterField): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: ColumnFilterMeta): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
