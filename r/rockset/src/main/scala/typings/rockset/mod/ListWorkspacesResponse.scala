package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesResponse extends StObject {
  
  // list of workspaces
  var data: js.UndefOr[js.Array[Workspace]] = js.undefined
}
object ListWorkspacesResponse {
  
  inline def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  extension [Self <: ListWorkspacesResponse](x: Self) {
    
    inline def setData(value: js.Array[Workspace]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Workspace*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
