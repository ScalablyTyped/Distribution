package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotValuePoint...
  */
@js.native
trait INxPivotValuePoint extends js.Object {
  
  /**
    * NxAttribute expressions values.
    */
  var qAttrExps: INxAttributeExpressionValues = js.native
  
  /**
    * Label of the cell.
    * >> This parameter is optional.
    */
  var qLabel: js.UndefOr[String] = js.native
  
  /**
    * Value of the cell.
    */
  var qNum: Double = js.native
  
  /**
    * Some text related to the cell.
    */
  var qText: String = js.native
  
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
  var qType: NxCellType = js.native
}
object INxPivotValuePoint {
  
  @scala.inline
  def apply(qAttrExps: INxAttributeExpressionValues, qNum: Double, qText: String, qType: NxCellType): INxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotValuePoint]
  }
  
  @scala.inline
  implicit class INxPivotValuePointOps[Self <: INxPivotValuePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQAttrExps(value: INxAttributeExpressionValues): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: NxCellType): Self = this.set("qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLabel(value: String): Self = this.set("qLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQLabel: Self = this.set("qLabel", js.undefined)
  }
}
