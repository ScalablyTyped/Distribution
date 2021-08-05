package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QIsDesktop extends StObject {
  
  var qIsDesktop: Boolean
  
  var qSSOEnabled: Boolean
}
object QIsDesktop {
  
  inline def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): QIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsDesktop]
  }
  
  extension [Self <: QIsDesktop](x: Self) {
    
    inline def setQIsDesktop(value: Boolean): Self = StObject.set(x, "qIsDesktop", value.asInstanceOf[js.Any])
    
    inline def setQSSOEnabled(value: Boolean): Self = StObject.set(x, "qSSOEnabled", value.asInstanceOf[js.Any])
  }
}
