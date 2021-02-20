package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotPage...
  */
@js.native
trait INxPivotPage extends StObject {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  
  /**
    * Array of data.
    */
  var qData: js.Array[INxPivotValuePoint] = js.native
  
  /**
    * Information about the left dimension values of a pivot table.
    */
  var qLeft: js.Array[INxPivotDimensionCell] = js.native
  
  /**
    * Information about the top dimension values of a pivot table.
    * If there is no top dimension in the pivot table, information about the measures are given.
    */
  var qTop: js.Array[INxPivotDimensionCell] = js.native
}
object INxPivotPage {
  
  @scala.inline
  def apply(
    qArea: IRect,
    qData: js.Array[INxPivotValuePoint],
    qLeft: js.Array[INxPivotDimensionCell],
    qTop: js.Array[INxPivotDimensionCell]
  ): INxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotPage]
  }
  
  @scala.inline
  implicit class INxPivotPageMutableBuilder[Self <: INxPivotPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQData(value: js.Array[INxPivotValuePoint]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataVarargs(value: INxPivotValuePoint*): Self = StObject.set(x, "qData", js.Array(value :_*))
    
    @scala.inline
    def setQLeft(value: js.Array[INxPivotDimensionCell]): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeftVarargs(value: INxPivotDimensionCell*): Self = StObject.set(x, "qLeft", js.Array(value :_*))
    
    @scala.inline
    def setQTop(value: js.Array[INxPivotDimensionCell]): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTopVarargs(value: INxPivotDimensionCell*): Self = StObject.set(x, "qTop", js.Array(value :_*))
  }
}
