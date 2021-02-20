package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxInfo extends StObject {
  
  var qId: String = js.native
  
  var qType: String = js.native
}
object NxInfo {
  
  @scala.inline
  def apply(qId: String, qType: String): NxInfo = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInfo]
  }
  
  @scala.inline
  implicit class NxInfoMutableBuilder[Self <: NxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
