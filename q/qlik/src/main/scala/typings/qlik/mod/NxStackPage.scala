package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxStackPage extends StObject {
  
  var qArea: Rect = js.native
  
  var qData: js.Array[NxStackedPivotCell] = js.native
}
object NxStackPage {
  
  @scala.inline
  def apply(qArea: Rect, qData: js.Array[NxStackedPivotCell]): NxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackPage]
  }
  
  @scala.inline
  implicit class NxStackPageMutableBuilder[Self <: NxStackPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQArea(value: Rect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQData(value: js.Array[NxStackedPivotCell]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataVarargs(value: NxStackedPivotCell*): Self = StObject.set(x, "qData", js.Array(value :_*))
  }
}
