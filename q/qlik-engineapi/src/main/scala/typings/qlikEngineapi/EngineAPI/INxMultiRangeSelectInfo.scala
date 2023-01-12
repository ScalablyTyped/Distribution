package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMultiRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxMultiRangeSelectInfo
  extends StObject
     with IRangeSelectInfo {
  
  /**
    * Number of the columns to select.
    * Numbering starts from 0.
    */
  var qColumnsToSelect: Double
}
object INxMultiRangeSelectInfo {
  
  inline def apply(qColumnsToSelect: Double, qRange: IRange): INxMultiRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qColumnsToSelect = qColumnsToSelect.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMultiRangeSelectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxMultiRangeSelectInfo] (val x: Self) extends AnyVal {
    
    inline def setQColumnsToSelect(value: Double): Self = StObject.set(x, "qColumnsToSelect", value.asInstanceOf[js.Any])
  }
}
