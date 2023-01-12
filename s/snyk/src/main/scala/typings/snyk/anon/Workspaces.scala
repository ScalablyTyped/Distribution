package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspaces extends StObject {
  
  var workspaces: js.Array[String]
}
object Workspaces {
  
  inline def apply(workspaces: js.Array[String]): Workspaces = {
    val __obj = js.Dynamic.literal(workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workspaces] (val x: Self) extends AnyVal {
    
    inline def setWorkspaces(value: js.Array[String]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesVarargs(value: String*): Self = StObject.set(x, "workspaces", js.Array(value*))
  }
}
