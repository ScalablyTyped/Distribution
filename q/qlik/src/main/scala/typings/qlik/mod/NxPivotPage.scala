package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxPivotPage extends StObject {
  
  var qArea: Rect
  
  var qData: js.Array[NxPivotValuePoint]
  
  var qLeft: js.Array[NxPivotDimensioncell]
  
  var qTop: js.Array[NxPivotDimensioncell]
}
object NxPivotPage {
  
  inline def apply(
    qArea: Rect,
    qData: js.Array[NxPivotValuePoint],
    qLeft: js.Array[NxPivotDimensioncell],
    qTop: js.Array[NxPivotDimensioncell]
  ): NxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotPage]
  }
  
  extension [Self <: NxPivotPage](x: Self) {
    
    inline def setQArea(value: Rect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    inline def setQData(value: js.Array[NxPivotValuePoint]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQDataVarargs(value: NxPivotValuePoint*): Self = StObject.set(x, "qData", js.Array(value*))
    
    inline def setQLeft(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    inline def setQLeftVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qLeft", js.Array(value*))
    
    inline def setQTop(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    inline def setQTopVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qTop", js.Array(value*))
  }
}
