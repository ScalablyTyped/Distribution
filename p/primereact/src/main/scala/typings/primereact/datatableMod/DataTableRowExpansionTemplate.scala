package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowExpansionTemplate extends StObject {
  
  var index: Double
}
object DataTableRowExpansionTemplate {
  
  inline def apply(index: Double): DataTableRowExpansionTemplate = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowExpansionTemplate]
  }
  
  extension [Self <: DataTableRowExpansionTemplate](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
