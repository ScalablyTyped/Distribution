package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_GROUP_UNSUBSCRIBE extends StObject {
  
  var groupId: String
}
object IROOM_GROUP_UNSUBSCRIBE {
  
  inline def apply(groupId: String): IROOM_GROUP_UNSUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_UNSUBSCRIBE]
  }
  
  extension [Self <: IROOM_GROUP_UNSUBSCRIBE](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
