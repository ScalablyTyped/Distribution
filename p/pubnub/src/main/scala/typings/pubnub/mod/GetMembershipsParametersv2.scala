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
  
  @scala.inline
  def apply(): GetMembershipsParametersv2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembershipsParametersv2]
  }
  
  @scala.inline
  implicit class GetMembershipsParametersv2MutableBuilder[Self <: GetMembershipsParametersv2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
