package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceRequest extends StObject {
  
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.undefined
  
  // descriptive label and unique identifier
  var name: String
}
object CreateWorkspaceRequest {
  
  inline def apply(name: String): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
  
  extension [Self <: CreateWorkspaceRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
