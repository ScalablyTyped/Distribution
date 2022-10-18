package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkspaceResponse extends StObject {
  
  /**
    * the workspace that was requested
    * @type {Workspace}
    * @memberof GetWorkspaceResponse
    */
  var data: js.UndefOr[Workspace] = js.undefined
}
object GetWorkspaceResponse {
  
  inline def apply(): GetWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceResponse]
  }
  
  extension [Self <: GetWorkspaceResponse](x: Self) {
    
    inline def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
