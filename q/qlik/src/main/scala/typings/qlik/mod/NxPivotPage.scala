package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxPivotPage extends StObject {
  
  var qArea: Rect = js.native
  
  var qData: js.Array[NxPivotValuePoint] = js.native
  
  var qLeft: js.Array[NxPivotDimensioncell] = js.native
  
  var qTop: js.Array[NxPivotDimensioncell] = js.native
}
object NxPivotPage {
  
  @scala.inline
  def apply(
    qArea: Rect,
    qData: js.Array[NxPivotValuePoint],
    qLeft: js.Array[NxPivotDimensioncell],
    qTop: js.Array[NxPivotDimensioncell]
  ): NxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotPage]
  }
  
  @scala.inline
  implicit class NxPivotPageMutableBuilder[Self <: NxPivotPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQArea(value: Rect): Self = StObject.set(x, "qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQData(value: js.Array[NxPivotValuePoint]): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataVarargs(value: NxPivotValuePoint*): Self = StObject.set(x, "qData", js.Array(value :_*))
    
    @scala.inline
    def setQLeft(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeftVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qLeft", js.Array(value :_*))
    
    @scala.inline
    def setQTop(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTopVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qTop", js.Array(value :_*))
  }
}
