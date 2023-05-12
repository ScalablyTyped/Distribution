package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.NodeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
/* Inlined std.Record<'table' | 'table_row' | 'table_cell' | 'table_header', prosemirror-model.prosemirror-model.NodeSpec> */
trait TableNodes_ extends StObject {
  
  var table: NodeSpec
  
  var table_cell: NodeSpec
  
  var table_header: NodeSpec
  
  var table_row: NodeSpec
}
object TableNodes_ {
  
  inline def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes_ = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], table_cell = table_cell.asInstanceOf[js.Any], table_header = table_header.asInstanceOf[js.Any], table_row = table_row.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodes_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableNodes_] (val x: Self) extends AnyVal {
    
    inline def setTable(value: NodeSpec): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTable_cell(value: NodeSpec): Self = StObject.set(x, "table_cell", value.asInstanceOf[js.Any])
    
    inline def setTable_header(value: NodeSpec): Self = StObject.set(x, "table_header", value.asInstanceOf[js.Any])
    
    inline def setTable_row(value: NodeSpec): Self = StObject.set(x, "table_row", value.asInstanceOf[js.Any])
  }
}
