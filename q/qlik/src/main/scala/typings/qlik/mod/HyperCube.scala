package typings.qlik.mod

import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperCube extends js.Object {
  
  var qDataPages: js.Array[NxDataPage] = js.native
  
  var qDimensionInfo: js.Array[NxDimensionInfo] = js.native
  
  var qEffectiveInterColumnSortOrder: js.Array[Double] = js.native
  
  var qError: NxValidationError = js.native
  
  var qGrandTotalRow: js.Array[NxCell] = js.native
  
  var qHasOtherValues: Boolean = js.native
  
  var qIndentMode: Boolean = js.native
  
  var qLastExpandedPos: NxCellPosition = js.native
  
  var qMeasureInfo: js.Array[NxMeasureInfo] = js.native
  
  var qMode: S | P | K = js.native
  
  var qNoOfLeftDims: Double = js.native
  
  var qPivotDataPages: js.Array[NxPivotPage] = js.native
  
  var qSize: Size = js.native
  
  var qStackedDataPages: js.Array[NxStackPage] = js.native
  
  var qStateName: String = js.native
}
object HyperCube {
  
  @scala.inline
  def apply(
    qDataPages: js.Array[NxDataPage],
    qDimensionInfo: js.Array[NxDimensionInfo],
    qEffectiveInterColumnSortOrder: js.Array[Double],
    qError: NxValidationError,
    qGrandTotalRow: js.Array[NxCell],
    qHasOtherValues: Boolean,
    qIndentMode: Boolean,
    qLastExpandedPos: NxCellPosition,
    qMeasureInfo: js.Array[NxMeasureInfo],
    qMode: S | P | K,
    qNoOfLeftDims: Double,
    qPivotDataPages: js.Array[NxPivotPage],
    qSize: Size,
    qStackedDataPages: js.Array[NxStackPage],
    qStateName: String
  ): HyperCube = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qGrandTotalRow = qGrandTotalRow.asInstanceOf[js.Any], qHasOtherValues = qHasOtherValues.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qLastExpandedPos = qLastExpandedPos.asInstanceOf[js.Any], qMeasureInfo = qMeasureInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPivotDataPages = qPivotDataPages.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStackedDataPages = qStackedDataPages.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperCube]
  }
  
  @scala.inline
  implicit class HyperCubeOps[Self <: HyperCube] (val x: Self) extends AnyVal {
    
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
    def setQDataPagesVarargs(value: NxDataPage*): Self = this.set("qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDataPages(value: js.Array[NxDataPage]): Self = this.set("qDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionInfoVarargs(value: NxDimensionInfo*): Self = this.set("qDimensionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQDimensionInfo(value: js.Array[NxDimensionInfo]): Self = this.set("qDimensionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQEffectiveInterColumnSortOrderVarargs(value: Double*): Self = this.set("qEffectiveInterColumnSortOrder", js.Array(value :_*))
    
    @scala.inline
    def setQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = this.set("qEffectiveInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: NxValidationError): Self = this.set("qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrandTotalRowVarargs(value: NxCell*): Self = this.set("qGrandTotalRow", js.Array(value :_*))
    
    @scala.inline
    def setQGrandTotalRow(value: js.Array[NxCell]): Self = this.set("qGrandTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHasOtherValues(value: Boolean): Self = this.set("qHasOtherValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIndentMode(value: Boolean): Self = this.set("qIndentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastExpandedPos(value: NxCellPosition): Self = this.set("qLastExpandedPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasureInfoVarargs(value: NxMeasureInfo*): Self = this.set("qMeasureInfo", js.Array(value :_*))
    
    @scala.inline
    def setQMeasureInfo(value: js.Array[NxMeasureInfo]): Self = this.set("qMeasureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMode(value: S | P | K): Self = this.set("qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = this.set("qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPivotDataPagesVarargs(value: NxPivotPage*): Self = this.set("qPivotDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQPivotDataPages(value: js.Array[NxPivotPage]): Self = this.set("qPivotDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSize(value: Size): Self = this.set("qSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStackedDataPagesVarargs(value: NxStackPage*): Self = this.set("qStackedDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQStackedDataPages(value: js.Array[NxStackPage]): Self = this.set("qStackedDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
  }
}
