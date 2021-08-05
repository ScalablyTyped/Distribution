package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableRow...
  */
trait ITableRow extends StObject {
  
  /**
    * Array of field values [{qText, qIsNumeric, qNumber},..]
    */
  var vqValue: js.Array[IFieldValue]
}
object ITableRow {
  
  inline def apply(vqValue: js.Array[IFieldValue]): ITableRow = {
    val __obj = js.Dynamic.literal(vqValue = vqValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRow]
  }
  
  extension [Self <: ITableRow](x: Self) {
    
    inline def setVqValue(value: js.Array[IFieldValue]): Self = StObject.set(x, "vqValue", value.asInstanceOf[js.Any])
    
    inline def setVqValueVarargs(value: IFieldValue*): Self = StObject.set(x, "vqValue", js.Array(value :_*))
  }
}
