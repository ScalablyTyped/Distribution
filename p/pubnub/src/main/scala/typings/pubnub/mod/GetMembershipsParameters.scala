package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Memberships
@js.native
trait GetMembershipsParameters extends GetObjectsParameters {
  
  var userId: String = js.native
}
object GetMembershipsParameters {
  
  @scala.inline
  def apply(userId: String): GetMembershipsParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipsParameters]
  }
  
  @scala.inline
  implicit class GetMembershipsParametersMutableBuilder[Self <: GetMembershipsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
