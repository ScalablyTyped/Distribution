package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkspaceResponse extends StObject {
  
  // the workspace that was created
  var data: js.UndefOr[Workspace] = js.native
}
object CreateWorkspaceResponse {
  
  @scala.inline
  def apply(): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
  
  @scala.inline
  implicit class CreateWorkspaceResponseMutableBuilder[Self <: CreateWorkspaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
