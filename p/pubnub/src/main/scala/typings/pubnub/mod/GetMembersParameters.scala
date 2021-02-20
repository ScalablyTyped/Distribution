package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Member
@js.native
trait GetMembersParameters extends GetObjectsParameters {
  
  var spaceId: String = js.native
}
object GetMembersParameters {
  
  @scala.inline
  def apply(spaceId: String): GetMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersParameters]
  }
  
  @scala.inline
  implicit class GetMembersParametersMutableBuilder[Self <: GetMembersParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
  }
}
