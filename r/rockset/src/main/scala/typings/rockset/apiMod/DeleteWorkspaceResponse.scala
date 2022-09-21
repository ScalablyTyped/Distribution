package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceResponse extends StObject {
  
  /**
    * the workspace that was deleted
    * @type {Workspace}
    * @memberof DeleteWorkspaceResponse
    */
  var data: js.UndefOr[Workspace] = js.undefined
}
object DeleteWorkspaceResponse {
  
  inline def apply(): DeleteWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkspaceResponse]
  }
  
  extension [Self <: DeleteWorkspaceResponse](x: Self) {
    
    inline def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
