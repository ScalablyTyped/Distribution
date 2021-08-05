package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRow extends StObject {
  
  var cells: js.Array[QDimensionCell | QMeasureCell]
  
  var dimensions: js.Array[QDimensionCell]
  
  var measures: js.Array[QMeasureCell]
}
object QRow {
  
  inline def apply(
    cells: js.Array[QDimensionCell | QMeasureCell],
    dimensions: js.Array[QDimensionCell],
    measures: js.Array[QMeasureCell]
  ): QRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRow]
  }
  
  extension [Self <: QRow](x: Self) {
    
    inline def setCells(value: js.Array[QDimensionCell | QMeasureCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: (QDimensionCell | QMeasureCell)*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    inline def setDimensions(value: js.Array[QDimensionCell]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(value: QDimensionCell*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setMeasures(value: js.Array[QMeasureCell]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresVarargs(value: QMeasureCell*): Self = StObject.set(x, "measures", js.Array(value :_*))
  }
}
