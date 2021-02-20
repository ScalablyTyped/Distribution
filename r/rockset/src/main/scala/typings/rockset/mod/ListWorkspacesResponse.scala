package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkspacesResponse extends StObject {
  
  // list of workspaces
  var data: js.UndefOr[js.Array[Workspace]] = js.native
}
object ListWorkspacesResponse {
  
  @scala.inline
  def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  @scala.inline
  implicit class ListWorkspacesResponseMutableBuilder[Self <: ListWorkspacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Workspace]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Workspace*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
