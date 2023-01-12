package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SourceKeyRecord...
  */
trait ISourceKeyRecord extends StObject {
  
  /**
    * Name of the key field.
    */
  var qKeyFields: js.Array[String]
  
  /**
    * Table the key belongs to.
    */
  var qTables: js.Array[String]
}
object ISourceKeyRecord {
  
  inline def apply(qKeyFields: js.Array[String], qTables: js.Array[String]): ISourceKeyRecord = {
    val __obj = js.Dynamic.literal(qKeyFields = qKeyFields.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceKeyRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISourceKeyRecord] (val x: Self) extends AnyVal {
    
    inline def setQKeyFields(value: js.Array[String]): Self = StObject.set(x, "qKeyFields", value.asInstanceOf[js.Any])
    
    inline def setQKeyFieldsVarargs(value: String*): Self = StObject.set(x, "qKeyFields", js.Array(value*))
    
    inline def setQTables(value: js.Array[String]): Self = StObject.set(x, "qTables", value.asInstanceOf[js.Any])
    
    inline def setQTablesVarargs(value: String*): Self = StObject.set(x, "qTables", js.Array(value*))
  }
}
