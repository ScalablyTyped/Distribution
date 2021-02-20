package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxStackPage...
  */
@js.native
trait INxStackPage extends StObject {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  
  /**
    * Array of data.
    */
  var qData: js.Array[INxStackedPivotCell] = js.native
}
object INxStackPage {
  
  @scala.inline
  def apply(qArea: IRect, qData: js.Array[INxStackedPivotCell]): INxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStackPage]
  }
  
  @scala.inline
  implicit class INxStackPageMutableBuilder[Self <: INxStackPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQArea(value: IRect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQData(value: js.Array[INxStackedPivotCell]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataVarargs(value: INxStackedPivotCell*): Self = StObject.set(x, "qData", js.Array(value :_*))
  }
}
