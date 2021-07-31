package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewDlgSaveInfo...
  */
trait ITableViewDlgSaveInfo extends StObject {
  
  /**
    * Set of data for internal and source view modes.
    */
  var qCtlInfo: ITableViewCtlSaveInfo
  
  /**
    * View mode to display when opening Qlik Sense data model viewer.
    * One of:
    *   0 for internal view mode
    *   1 for source view mode
    */
  var qMode: Double
  
  /**
    * Information about the position of the dialog window.
    * Not used in Qlik Sense.
    */
  var qPos: IRect
}
object ITableViewDlgSaveInfo {
  
  @scala.inline
  def apply(qCtlInfo: ITableViewCtlSaveInfo, qMode: Double, qPos: IRect): ITableViewDlgSaveInfo = {
    val __obj = js.Dynamic.literal(qCtlInfo = qCtlInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewDlgSaveInfo]
  }
  
  @scala.inline
  implicit class ITableViewDlgSaveInfoMutableBuilder[Self <: ITableViewDlgSaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCtlInfo(value: ITableViewCtlSaveInfo): Self = StObject.set(x, "qCtlInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMode(value: Double): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPos(value: IRect): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
  }
}
