package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Memberships
trait GetMembershipsParameters
  extends StObject
     with GetObjectsParameters {
  
  var userId: String
}
object GetMembershipsParameters {
  
  inline def apply(userId: String): GetMembershipsParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipsParameters]
  }
  
  extension [Self <: GetMembershipsParameters](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
