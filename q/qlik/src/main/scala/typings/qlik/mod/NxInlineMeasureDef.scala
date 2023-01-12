package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxInlineMeasureDef extends StObject {
  
  var qcx: Double
  
  var qcy: Double
}
object NxInlineMeasureDef {
  
  inline def apply(qcx: Double, qcy: Double): NxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInlineMeasureDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxInlineMeasureDef] (val x: Self) extends AnyVal {
    
    inline def setQcx(value: Double): Self = StObject.set(x, "qcx", value.asInstanceOf[js.Any])
    
    inline def setQcy(value: Double): Self = StObject.set(x, "qcy", value.asInstanceOf[js.Any])
  }
}
