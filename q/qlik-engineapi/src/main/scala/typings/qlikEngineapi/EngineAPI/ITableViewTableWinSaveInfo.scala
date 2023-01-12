package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewTableWinSaveInfo...
  */
trait ITableViewTableWinSaveInfo extends StObject {
  
  /**
    * Table name.
    */
  var qCaption: String
  
  /**
    * Information about the position of the table.
    */
  var qPos: IRect
}
object ITableViewTableWinSaveInfo {
  
  inline def apply(qCaption: String, qPos: IRect): ITableViewTableWinSaveInfo = {
    val __obj = js.Dynamic.literal(qCaption = qCaption.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewTableWinSaveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableViewTableWinSaveInfo] (val x: Self) extends AnyVal {
    
    inline def setQCaption(value: String): Self = StObject.set(x, "qCaption", value.asInstanceOf[js.Any])
    
    inline def setQPos(value: IRect): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
  }
}
