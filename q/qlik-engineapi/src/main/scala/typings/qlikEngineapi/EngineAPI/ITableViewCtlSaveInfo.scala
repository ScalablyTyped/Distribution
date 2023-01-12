package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewCtlSaveInfo...
  */
trait ITableViewCtlSaveInfo extends StObject {
  
  /**
    * Internal view mode.
    */
  var qInternalView: ITableViewSaveInfo
  
  /**
    * Source view mode.
    */
  var qSourceView: ITableViewSaveInfo
}
object ITableViewCtlSaveInfo {
  
  inline def apply(qInternalView: ITableViewSaveInfo, qSourceView: ITableViewSaveInfo): ITableViewCtlSaveInfo = {
    val __obj = js.Dynamic.literal(qInternalView = qInternalView.asInstanceOf[js.Any], qSourceView = qSourceView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewCtlSaveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableViewCtlSaveInfo] (val x: Self) extends AnyVal {
    
    inline def setQInternalView(value: ITableViewSaveInfo): Self = StObject.set(x, "qInternalView", value.asInstanceOf[js.Any])
    
    inline def setQSourceView(value: ITableViewSaveInfo): Self = StObject.set(x, "qSourceView", value.asInstanceOf[js.Any])
  }
}
