package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAllGroupsResponse extends StObject {
  
  var groups: js.Array[String] = js.native
}
object ListAllGroupsResponse {
  
  @scala.inline
  def apply(groups: js.Array[String]): ListAllGroupsResponse = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllGroupsResponse]
  }
  
  @scala.inline
  implicit class ListAllGroupsResponseMutableBuilder[Self <: ListAllGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
