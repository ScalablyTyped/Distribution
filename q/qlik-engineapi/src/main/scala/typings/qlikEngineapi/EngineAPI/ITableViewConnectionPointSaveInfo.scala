package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewConnectionPointSaveInfo...
  */
trait ITableViewConnectionPointSaveInfo extends StObject {
  
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[String]
  
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint
}
object ITableViewConnectionPointSaveInfo {
  
  inline def apply(qFields: js.Array[String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableViewConnectionPointSaveInfo] (val x: Self) extends AnyVal {
    
    inline def setQFields(value: js.Array[String]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    inline def setQFieldsVarargs(value: String*): Self = StObject.set(x, "qFields", js.Array(value*))
    
    inline def setQPos(value: IPoint): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
  }
}
