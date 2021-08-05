package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxContinuousRangeSelectInfo
  extends StObject
     with IRangeSelectInfo {
  
  /**
    * Dimension index.
    */
  var qDimIx: Double
}
object INxContinuousRangeSelectInfo {
  
  inline def apply(qDimIx: Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
  
  extension [Self <: INxContinuousRangeSelectInfo](x: Self) {
    
    inline def setQDimIx(value: Double): Self = StObject.set(x, "qDimIx", value.asInstanceOf[js.Any])
  }
}
