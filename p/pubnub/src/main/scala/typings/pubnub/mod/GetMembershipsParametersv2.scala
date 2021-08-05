package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembershipsParametersv2
  extends StObject
     with ChannelMembersParameters {
  
  var uuid: js.UndefOr[String] = js.undefined
}
object GetMembershipsParametersv2 {
  
  inline def apply(): GetMembershipsParametersv2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembershipsParametersv2]
  }
  
  extension [Self <: GetMembershipsParametersv2](x: Self) {
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
