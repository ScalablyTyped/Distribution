package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * INxDataPage...
  */
trait INxDataPage extends StObject {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect
  
  /**
    * Is set to true, if the data have been reduced.
    * The default value is false.
    */
  var qIsReduced: Boolean
  
  /**
    * Array of data.
    */
  var qMatrix: js.Array[INxCellRows]
  
  /**
    * Array of tails.
    * Is used for hypercube objects with multiple dimensions. It might happen that due to the window size some elements
    * in a group cannot be displayed in the same page as the other elements of the group. Elements of a group of
    * dimensions can be part of the previous or the next tail.
    * If there is no tail, the array is empty [ ].
    */
  var qTails: js.Array[INxGroupTail]
}
object INxDataPage {
  
  inline def apply(qArea: IRect, qIsReduced: Boolean, qMatrix: js.Array[INxCellRows], qTails: js.Array[INxGroupTail]): INxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDataPage]
  }
  
  extension [Self <: INxDataPage](x: Self) {
    
    inline def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    inline def setQIsReduced(value: Boolean): Self = StObject.set(x, "qIsReduced", value.asInstanceOf[js.Any])
    
    inline def setQMatrix(value: js.Array[INxCellRows]): Self = StObject.set(x, "qMatrix", value.asInstanceOf[js.Any])
    
    inline def setQMatrixVarargs(value: INxCellRows*): Self = StObject.set(x, "qMatrix", js.Array(value*))
    
    inline def setQTails(value: js.Array[INxGroupTail]): Self = StObject.set(x, "qTails", value.asInstanceOf[js.Any])
    
    inline def setQTailsVarargs(value: INxGroupTail*): Self = StObject.set(x, "qTails", js.Array(value*))
  }
}
