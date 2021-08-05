package typings.qlik.mod

import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperCube extends StObject {
  
  var qDataPages: js.Array[NxDataPage]
  
  var qDimensionInfo: js.Array[NxDimensionInfo]
  
  var qEffectiveInterColumnSortOrder: js.Array[Double]
  
  var qError: NxValidationError
  
  var qGrandTotalRow: js.Array[NxCell]
  
  var qHasOtherValues: Boolean
  
  var qIndentMode: Boolean
  
  var qLastExpandedPos: NxCellPosition
  
  var qMeasureInfo: js.Array[NxMeasureInfo]
  
  var qMode: S | P | K
  
  var qNoOfLeftDims: Double
  
  var qPivotDataPages: js.Array[NxPivotPage]
  
  var qSize: Size
  
  var qStackedDataPages: js.Array[NxStackPage]
  
  var qStateName: String
}
object HyperCube {
  
  inline def apply(
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
  
  extension [Self <: HyperCube](x: Self) {
    
    inline def setQDataPages(value: js.Array[NxDataPage]): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
    
    inline def setQDataPagesVarargs(value: NxDataPage*): Self = StObject.set(x, "qDataPages", js.Array(value :_*))
    
    inline def setQDimensionInfo(value: js.Array[NxDimensionInfo]): Self = StObject.set(x, "qDimensionInfo", value.asInstanceOf[js.Any])
    
    inline def setQDimensionInfoVarargs(value: NxDimensionInfo*): Self = StObject.set(x, "qDimensionInfo", js.Array(value :_*))
    
    inline def setQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    inline def setQEffectiveInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", js.Array(value :_*))
    
    inline def setQError(value: NxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    inline def setQGrandTotalRow(value: js.Array[NxCell]): Self = StObject.set(x, "qGrandTotalRow", value.asInstanceOf[js.Any])
    
    inline def setQGrandTotalRowVarargs(value: NxCell*): Self = StObject.set(x, "qGrandTotalRow", js.Array(value :_*))
    
    inline def setQHasOtherValues(value: Boolean): Self = StObject.set(x, "qHasOtherValues", value.asInstanceOf[js.Any])
    
    inline def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    inline def setQLastExpandedPos(value: NxCellPosition): Self = StObject.set(x, "qLastExpandedPos", value.asInstanceOf[js.Any])
    
    inline def setQMeasureInfo(value: js.Array[NxMeasureInfo]): Self = StObject.set(x, "qMeasureInfo", value.asInstanceOf[js.Any])
    
    inline def setQMeasureInfoVarargs(value: NxMeasureInfo*): Self = StObject.set(x, "qMeasureInfo", js.Array(value :_*))
    
    inline def setQMode(value: S | P | K): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    inline def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    inline def setQPivotDataPages(value: js.Array[NxPivotPage]): Self = StObject.set(x, "qPivotDataPages", value.asInstanceOf[js.Any])
    
    inline def setQPivotDataPagesVarargs(value: NxPivotPage*): Self = StObject.set(x, "qPivotDataPages", js.Array(value :_*))
    
    inline def setQSize(value: Size): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
    
    inline def setQStackedDataPages(value: js.Array[NxStackPage]): Self = StObject.set(x, "qStackedDataPages", value.asInstanceOf[js.Any])
    
    inline def setQStackedDataPagesVarargs(value: NxStackPage*): Self = StObject.set(x, "qStackedDataPages", js.Array(value :_*))
    
    inline def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
