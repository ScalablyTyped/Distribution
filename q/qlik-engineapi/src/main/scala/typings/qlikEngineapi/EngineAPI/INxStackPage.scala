package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxStackPage...
  */
trait INxStackPage extends StObject {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect
  
  /**
    * Array of data.
    */
  var qData: js.Array[INxStackedPivotCell]
}
object INxStackPage {
  
  inline def apply(qArea: IRect, qData: js.Array[INxStackedPivotCell]): INxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStackPage]
  }
  
  extension [Self <: INxStackPage](x: Self) {
    
    inline def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    inline def setQData(value: js.Array[INxStackedPivotCell]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQDataVarargs(value: INxStackedPivotCell*): Self = StObject.set(x, "qData", js.Array(value*))
  }
}
