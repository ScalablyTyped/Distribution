package typings.qlik.mod

import typings.qlik.qlikNumbers.`-1`
import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`1`
import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperCubeDef extends StObject {
  
  var qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.undefined
  
  var qCalcCond: js.UndefOr[ValueExpr] = js.undefined
  
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.undefined
  
  var qIndentMode: js.UndefOr[Boolean] = js.undefined
  
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.undefined
  
  var qInterColumnSortOrder: js.UndefOr[js.Array[Double]] = js.undefined
  
  var qMaxStackedCells: js.UndefOr[Double] = js.undefined
  
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.undefined
  
  var qMode: js.UndefOr[S | P | K] = js.undefined
  
  var qNoOfLeftDims: js.UndefOr[Double] = js.undefined
  
  var qPopulateMissing: js.UndefOr[Boolean] = js.undefined
  
  var qShowTotalsAbove: js.UndefOr[Boolean] = js.undefined
  
  var qSortByYValue: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  
  var qStateName: js.UndefOr[String] = js.undefined
  
  var qSuppressZero: js.UndefOr[Boolean] = js.undefined
  
  var qSupressMissing: js.UndefOr[Boolean] = js.undefined
}
object HyperCubeDef {
  
  inline def apply(): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperCubeDef]
  }
  
  extension [Self <: HyperCubeDef](x: Self) {
    
    inline def setQAlwaysFullyExpanded(value: Boolean): Self = StObject.set(x, "qAlwaysFullyExpanded", value.asInstanceOf[js.Any])
    
    inline def setQAlwaysFullyExpandedUndefined: Self = StObject.set(x, "qAlwaysFullyExpanded", js.undefined)
    
    inline def setQCalcCond(value: ValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    inline def setQCalcCondUndefined: Self = StObject.set(x, "qCalcCond", js.undefined)
    
    inline def setQDimensions(value: js.Array[NxDimension]): Self = StObject.set(x, "qDimensions", value.asInstanceOf[js.Any])
    
    inline def setQDimensionsUndefined: Self = StObject.set(x, "qDimensions", js.undefined)
    
    inline def setQDimensionsVarargs(value: NxDimension*): Self = StObject.set(x, "qDimensions", js.Array(value :_*))
    
    inline def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    inline def setQIndentModeUndefined: Self = StObject.set(x, "qIndentMode", js.undefined)
    
    inline def setQInitialDataFetch(value: js.Array[NxPage]): Self = StObject.set(x, "qInitialDataFetch", value.asInstanceOf[js.Any])
    
    inline def setQInitialDataFetchUndefined: Self = StObject.set(x, "qInitialDataFetch", js.undefined)
    
    inline def setQInitialDataFetchVarargs(value: NxPage*): Self = StObject.set(x, "qInitialDataFetch", js.Array(value :_*))
    
    inline def setQInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    inline def setQInterColumnSortOrderUndefined: Self = StObject.set(x, "qInterColumnSortOrder", js.undefined)
    
    inline def setQInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qInterColumnSortOrder", js.Array(value :_*))
    
    inline def setQMaxStackedCells(value: Double): Self = StObject.set(x, "qMaxStackedCells", value.asInstanceOf[js.Any])
    
    inline def setQMaxStackedCellsUndefined: Self = StObject.set(x, "qMaxStackedCells", js.undefined)
    
    inline def setQMeasures(value: js.Array[NxMeasure]): Self = StObject.set(x, "qMeasures", value.asInstanceOf[js.Any])
    
    inline def setQMeasuresUndefined: Self = StObject.set(x, "qMeasures", js.undefined)
    
    inline def setQMeasuresVarargs(value: NxMeasure*): Self = StObject.set(x, "qMeasures", js.Array(value :_*))
    
    inline def setQMode(value: S | P | K): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    inline def setQModeUndefined: Self = StObject.set(x, "qMode", js.undefined)
    
    inline def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    inline def setQNoOfLeftDimsUndefined: Self = StObject.set(x, "qNoOfLeftDims", js.undefined)
    
    inline def setQPopulateMissing(value: Boolean): Self = StObject.set(x, "qPopulateMissing", value.asInstanceOf[js.Any])
    
    inline def setQPopulateMissingUndefined: Self = StObject.set(x, "qPopulateMissing", js.undefined)
    
    inline def setQShowTotalsAbove(value: Boolean): Self = StObject.set(x, "qShowTotalsAbove", value.asInstanceOf[js.Any])
    
    inline def setQShowTotalsAboveUndefined: Self = StObject.set(x, "qShowTotalsAbove", js.undefined)
    
    inline def setQSortByYValue(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByYValue", value.asInstanceOf[js.Any])
    
    inline def setQSortByYValueUndefined: Self = StObject.set(x, "qSortByYValue", js.undefined)
    
    inline def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
    
    inline def setQStateNameUndefined: Self = StObject.set(x, "qStateName", js.undefined)
    
    inline def setQSuppressZero(value: Boolean): Self = StObject.set(x, "qSuppressZero", value.asInstanceOf[js.Any])
    
    inline def setQSuppressZeroUndefined: Self = StObject.set(x, "qSuppressZero", js.undefined)
    
    inline def setQSupressMissing(value: Boolean): Self = StObject.set(x, "qSupressMissing", value.asInstanceOf[js.Any])
    
    inline def setQSupressMissingUndefined: Self = StObject.set(x, "qSupressMissing", js.undefined)
  }
}
