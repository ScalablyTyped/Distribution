package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxInfo extends StObject {
  
  var qId: String
  
  var qType: String
}
object NxInfo {
  
  inline def apply(qId: String, qType: String): NxInfo = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxInfo] (val x: Self) extends AnyVal {
    
    inline def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    inline def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
