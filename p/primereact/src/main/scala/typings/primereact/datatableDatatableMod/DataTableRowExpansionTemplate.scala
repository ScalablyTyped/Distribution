package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the row expansion template
  * @see {@link DataTableProps.rowExpansionTemplate}
  */
trait DataTableRowExpansionTemplate extends StObject {
  
  /**
    * Used to override the rendering of the content.
    */
  var customRendering: Boolean
  
  /**
    * Index of the row.
    */
  var index: Double
}
object DataTableRowExpansionTemplate {
  
  inline def apply(customRendering: Boolean, index: Double): DataTableRowExpansionTemplate = {
    val __obj = js.Dynamic.literal(customRendering = customRendering.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowExpansionTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowExpansionTemplate] (val x: Self) extends AnyVal {
    
    inline def setCustomRendering(value: Boolean): Self = StObject.set(x, "customRendering", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
