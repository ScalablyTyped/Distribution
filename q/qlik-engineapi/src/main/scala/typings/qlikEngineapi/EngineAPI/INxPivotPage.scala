package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotPage...
  */
trait INxPivotPage extends StObject {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect
  
  /**
    * Array of data.
    */
  var qData: js.Array[INxPivotValuePoint]
  
  /**
    * Information about the left dimension values of a pivot table.
    */
  var qLeft: js.Array[INxPivotDimensionCell]
  
  /**
    * Information about the top dimension values of a pivot table.
    * If there is no top dimension in the pivot table, information about the measures are given.
    */
  var qTop: js.Array[INxPivotDimensionCell]
}
object INxPivotPage {
  
  inline def apply(
    qArea: IRect,
    qData: js.Array[INxPivotValuePoint],
    qLeft: js.Array[INxPivotDimensionCell],
    qTop: js.Array[INxPivotDimensionCell]
  ): INxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotPage]
  }
  
  extension [Self <: INxPivotPage](x: Self) {
    
    inline def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    inline def setQData(value: js.Array[INxPivotValuePoint]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQDataVarargs(value: INxPivotValuePoint*): Self = StObject.set(x, "qData", js.Array(value*))
    
    inline def setQLeft(value: js.Array[INxPivotDimensionCell]): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    inline def setQLeftVarargs(value: INxPivotDimensionCell*): Self = StObject.set(x, "qLeft", js.Array(value*))
    
    inline def setQTop(value: js.Array[INxPivotDimensionCell]): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    inline def setQTopVarargs(value: INxPivotDimensionCell*): Self = StObject.set(x, "qTop", js.Array(value*))
  }
}
