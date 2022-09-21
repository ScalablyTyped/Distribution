package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableShowRowReorderElementOptions extends StObject {
  
  var props: DataTableProps
  
  var rowIndex: Double
}
object DataTableShowRowReorderElementOptions {
  
  inline def apply(props: DataTableProps, rowIndex: Double): DataTableShowRowReorderElementOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableShowRowReorderElementOptions]
  }
  
  extension [Self <: DataTableShowRowReorderElementOptions](x: Self) {
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
