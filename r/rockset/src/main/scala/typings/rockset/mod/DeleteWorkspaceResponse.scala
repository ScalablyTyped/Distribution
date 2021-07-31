package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceResponse extends StObject {
  
  // the workspace that was deleted
  var data: js.UndefOr[Workspace] = js.undefined
}
object DeleteWorkspaceResponse {
  
  @scala.inline
  def apply(): DeleteWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkspaceResponse]
  }
  
  @scala.inline
  implicit class DeleteWorkspaceResponseMutableBuilder[Self <: DeleteWorkspaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
