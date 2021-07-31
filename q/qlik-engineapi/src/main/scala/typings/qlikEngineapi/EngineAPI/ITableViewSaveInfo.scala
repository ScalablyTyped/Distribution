package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewSaveInfo...
  */
trait ITableViewSaveInfo extends StObject {
  
  /**
    * List of the broom points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qBroomPoints: js.Array[ITableViewBroomPointSaveInfo]
  
  /**
    * List of connection points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo]
  
  /**
    * List of the tables in the database model viewer.
    */
  var qTables: js.Array[ITableViewTableWinSaveInfo]
  
  /**
    * Zoom factor in the database model viewer.
    * The default value is 1.0.
    */
  var qZoomFactor: Double
}
object ITableViewSaveInfo {
  
  @scala.inline
  def apply(
    qBroomPoints: js.Array[ITableViewBroomPointSaveInfo],
    qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo],
    qTables: js.Array[ITableViewTableWinSaveInfo],
    qZoomFactor: Double
  ): ITableViewSaveInfo = {
    val __obj = js.Dynamic.literal(qBroomPoints = qBroomPoints.asInstanceOf[js.Any], qConnectionPoints = qConnectionPoints.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any], qZoomFactor = qZoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewSaveInfo]
  }
  
  @scala.inline
  implicit class ITableViewSaveInfoMutableBuilder[Self <: ITableViewSaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBroomPoints(value: js.Array[ITableViewBroomPointSaveInfo]): Self = StObject.set(x, "qBroomPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBroomPointsVarargs(value: ITableViewBroomPointSaveInfo*): Self = StObject.set(x, "qBroomPoints", js.Array(value :_*))
    
    @scala.inline
    def setQConnectionPoints(value: js.Array[ITableViewConnectionPointSaveInfo]): Self = StObject.set(x, "qConnectionPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQConnectionPointsVarargs(value: ITableViewConnectionPointSaveInfo*): Self = StObject.set(x, "qConnectionPoints", js.Array(value :_*))
    
    @scala.inline
    def setQTables(value: js.Array[ITableViewTableWinSaveInfo]): Self = StObject.set(x, "qTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTablesVarargs(value: ITableViewTableWinSaveInfo*): Self = StObject.set(x, "qTables", js.Array(value :_*))
    
    @scala.inline
    def setQZoomFactor(value: Double): Self = StObject.set(x, "qZoomFactor", value.asInstanceOf[js.Any])
  }
}
