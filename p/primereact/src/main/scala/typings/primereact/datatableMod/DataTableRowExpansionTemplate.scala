package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowExpansionTemplate extends StObject {
  
  var customRendering: Boolean
  
  var index: Double
}
object DataTableRowExpansionTemplate {
  
  inline def apply(customRendering: Boolean, index: Double): DataTableRowExpansionTemplate = {
    val __obj = js.Dynamic.literal(customRendering = customRendering.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowExpansionTemplate]
  }
  
  extension [Self <: DataTableRowExpansionTemplate](x: Self) {
    
    inline def setCustomRendering(value: Boolean): Self = StObject.set(x, "customRendering", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
