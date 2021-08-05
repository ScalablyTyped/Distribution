package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Member
trait GetMembersParameters
  extends StObject
     with GetObjectsParameters {
  
  var spaceId: String
}
object GetMembersParameters {
  
  inline def apply(spaceId: String): GetMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersParameters]
  }
  
  extension [Self <: GetMembersParameters](x: Self) {
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
  }
}
