package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxDataPage extends StObject {
  
  var qArea: Rect
  
  var qIsReduced: Boolean
  
  var qMatrix: js.Array[NxCellRows]
  
  var qTails: js.Array[NxGroupTail]
}
object NxDataPage {
  
  @scala.inline
  def apply(qArea: Rect, qIsReduced: Boolean, qMatrix: js.Array[NxCellRows], qTails: js.Array[NxGroupTail]): NxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDataPage]
  }
  
  @scala.inline
  implicit class NxDataPageMutableBuilder[Self <: NxDataPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQArea(value: Rect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsReduced(value: Boolean): Self = StObject.set(x, "qIsReduced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMatrix(value: js.Array[NxCellRows]): Self = StObject.set(x, "qMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMatrixVarargs(value: NxCellRows*): Self = StObject.set(x, "qMatrix", js.Array(value :_*))
    
    @scala.inline
    def setQTails(value: js.Array[NxGroupTail]): Self = StObject.set(x, "qTails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTailsVarargs(value: NxGroupTail*): Self = StObject.set(x, "qTails", js.Array(value :_*))
  }
}
