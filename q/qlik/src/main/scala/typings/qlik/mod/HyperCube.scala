package typings.qlik.mod

import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperCube extends StObject {
  
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
  implicit class HyperCubeMutableBuilder[Self <: HyperCube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDataPages(value: js.Array[NxDataPage]): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataPagesVarargs(value: NxDataPage*): Self = StObject.set(x, "qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDimensionInfo(value: js.Array[NxDimensionInfo]): Self = StObject.set(x, "qDimensionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionInfoVarargs(value: NxDimensionInfo*): Self = StObject.set(x, "qDimensionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQEffectiveInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", js.Array(value :_*))
    
    @scala.inline
    def setQError(value: NxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrandTotalRow(value: js.Array[NxCell]): Self = StObject.set(x, "qGrandTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrandTotalRowVarargs(value: NxCell*): Self = StObject.set(x, "qGrandTotalRow", js.Array(value :_*))
    
    @scala.inline
    def setQHasOtherValues(value: Boolean): Self = StObject.set(x, "qHasOtherValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastExpandedPos(value: NxCellPosition): Self = StObject.set(x, "qLastExpandedPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasureInfo(value: js.Array[NxMeasureInfo]): Self = StObject.set(x, "qMeasureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasureInfoVarargs(value: NxMeasureInfo*): Self = StObject.set(x, "qMeasureInfo", js.Array(value :_*))
    
    @scala.inline
    def setQMode(value: S | P | K): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPivotDataPages(value: js.Array[NxPivotPage]): Self = StObject.set(x, "qPivotDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPivotDataPagesVarargs(value: NxPivotPage*): Self = StObject.set(x, "qPivotDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQSize(value: Size): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStackedDataPages(value: js.Array[NxStackPage]): Self = StObject.set(x, "qStackedDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStackedDataPagesVarargs(value: NxStackPage*): Self = StObject.set(x, "qStackedDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
