package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceResponse extends StObject {
  
  /**
    * the workspace that was created
    * @type {Workspace}
    * @memberof CreateWorkspaceResponse
    */
  var data: js.UndefOr[Workspace] = js.undefined
}
object CreateWorkspaceResponse {
  
  inline def apply(): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkspaceResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Workspace): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
