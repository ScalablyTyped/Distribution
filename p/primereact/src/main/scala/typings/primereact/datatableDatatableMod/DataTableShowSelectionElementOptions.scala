package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableShowSelectionElementOptions extends StObject {
  
  var props: DataTableProps
  
  var rowIndex: Double
}
object DataTableShowSelectionElementOptions {
  
  inline def apply(props: DataTableProps, rowIndex: Double): DataTableShowSelectionElementOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableShowSelectionElementOptions]
  }
  
  extension [Self <: DataTableShowSelectionElementOptions](x: Self) {
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
