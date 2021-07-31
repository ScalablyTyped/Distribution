package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewBroomPointSaveInfo...
  */
trait ITableViewBroomPointSaveInfo extends StObject {
  
  /**
    * List of fields in the table.
    */
  var qFields: js.Array[String]
  
  /**
    * Information about the position of the broom point.
    */
  var qPos: IPoint
  
  /**
    * Name of the table.
    */
  var qTable: String
}
object ITableViewBroomPointSaveInfo {
  
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint, qTable: String): ITableViewBroomPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any], qTable = qTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewBroomPointSaveInfo]
  }
  
  @scala.inline
  implicit class ITableViewBroomPointSaveInfoMutableBuilder[Self <: ITableViewBroomPointSaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFields(value: js.Array[String]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldsVarargs(value: String*): Self = StObject.set(x, "qFields", js.Array(value :_*))
    
    @scala.inline
    def setQPos(value: IPoint): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTable(value: String): Self = StObject.set(x, "qTable", value.asInstanceOf[js.Any])
  }
}
