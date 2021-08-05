package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAllGroupsResponse extends StObject {
  
  var groups: js.Array[String]
}
object ListAllGroupsResponse {
  
  inline def apply(groups: js.Array[String]): ListAllGroupsResponse = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllGroupsResponse]
  }
  
  extension [Self <: ListAllGroupsResponse](x: Self) {
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
