package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_GROUP_UNSUBSCRIBE extends StObject {
  
  var groupId: String = js.native
}
object IROOM_GROUP_UNSUBSCRIBE {
  
  @scala.inline
  def apply(groupId: String): IROOM_GROUP_UNSUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_UNSUBSCRIBE]
  }
  
  @scala.inline
  implicit class IROOM_GROUP_UNSUBSCRIBEMutableBuilder[Self <: IROOM_GROUP_UNSUBSCRIBE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
