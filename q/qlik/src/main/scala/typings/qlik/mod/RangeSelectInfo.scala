package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectInfo extends StObject {
  
  var qMeasure: String
  
  var qRangeHi: Double
  
  var qRangeLo: Double
}
object RangeSelectInfo {
  
  inline def apply(qMeasure: String, qRangeHi: Double, qRangeLo: Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasure = qMeasure.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeSelectInfo] (val x: Self) extends AnyVal {
    
    inline def setQMeasure(value: String): Self = StObject.set(x, "qMeasure", value.asInstanceOf[js.Any])
    
    inline def setQRangeHi(value: Double): Self = StObject.set(x, "qRangeHi", value.asInstanceOf[js.Any])
    
    inline def setQRangeLo(value: Double): Self = StObject.set(x, "qRangeLo", value.asInstanceOf[js.Any])
  }
}
