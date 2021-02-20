package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewConnectionPointSaveInfo...
  */
@js.native
trait ITableViewConnectionPointSaveInfo extends StObject {
  
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[String] = js.native
  
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint = js.native
}
object ITableViewConnectionPointSaveInfo {
  
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
  
  @scala.inline
  implicit class ITableViewConnectionPointSaveInfoMutableBuilder[Self <: ITableViewConnectionPointSaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFields(value: js.Array[String]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldsVarargs(value: String*): Self = StObject.set(x, "qFields", js.Array(value :_*))
    
    @scala.inline
    def setQPos(value: IPoint): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
  }
}
