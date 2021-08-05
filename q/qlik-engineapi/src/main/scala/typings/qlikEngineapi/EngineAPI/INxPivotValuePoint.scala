package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotValuePoint...
  */
trait INxPivotValuePoint extends StObject {
  
  /**
    * NxAttribute expressions values.
    */
  var qAttrExps: INxAttributeExpressionValues
  
  /**
    * Label of the cell.
    * >> This parameter is optional.
    */
  var qLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the cell.
    */
  var qNum: Double
  
  /**
    * Some text related to the cell.
    */
  var qText: String
  
  /**
    * Type of the cell.
    *
    * One of:
    *
    *    V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    *    E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    *    N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    *    T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total
    *    P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    *    R for NX_DIM_CELL_ROOT. Applies to root node.
    *    U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  var qType: NxCellType
}
object INxPivotValuePoint {
  
  inline def apply(qAttrExps: INxAttributeExpressionValues, qNum: Double, qText: String, qType: NxCellType): INxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotValuePoint]
  }
  
  extension [Self <: INxPivotValuePoint](x: Self) {
    
    inline def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
    
    inline def setQLabelUndefined: Self = StObject.set(x, "qLabel", js.undefined)
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: NxCellType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
