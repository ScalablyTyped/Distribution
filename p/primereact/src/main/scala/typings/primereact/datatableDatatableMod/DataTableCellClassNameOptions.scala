package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCellClassNameOptions extends StObject {
  
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  var props: DataTableProps
  
  var rowData: Any
}
object DataTableCellClassNameOptions {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    props: DataTableProps,
    rowData: Any
  ): DataTableCellClassNameOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellClassNameOptions]
  }
  
  extension [Self <: DataTableCellClassNameOptions](x: Self) {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
