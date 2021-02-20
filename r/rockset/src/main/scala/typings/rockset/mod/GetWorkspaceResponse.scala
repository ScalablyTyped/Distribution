package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkspaceResponse extends StObject {
  
  // the workspace that was requested
  var data: js.UndefOr[Workspace] = js.native
}
object GetWorkspaceResponse {
  
  @scala.inline
  def apply(): GetWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceResponse]
  }
  
  @scala.inline
  implicit class GetWorkspaceResponseMutableBuilder[Self <: GetWorkspaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
