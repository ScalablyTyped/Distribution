package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditValidatorOptions extends StObject {
  
  var props: DataTableProps
}
object DataTableRowEditValidatorOptions {
  
  inline def apply(props: DataTableProps): DataTableRowEditValidatorOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditValidatorOptions]
  }
  
  extension [Self <: DataTableRowEditValidatorOptions](x: Self) {
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
