package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataRecord...
  */
trait IDataRecord extends StObject {
  
  /**
    * List of values inside the table.
    * The first values (in result/qPreview/0/qValues) correspond to the field names in the table.
    * The following values (from result/qPreview/1/qValues) are the values of the fields in the table.
    */
  var qValues: js.Array[String]
}
object IDataRecord {
  
  inline def apply(qValues: js.Array[String]): IDataRecord = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRecord]
  }
  
  extension [Self <: IDataRecord](x: Self) {
    
    inline def setQValues(value: js.Array[String]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: String*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
