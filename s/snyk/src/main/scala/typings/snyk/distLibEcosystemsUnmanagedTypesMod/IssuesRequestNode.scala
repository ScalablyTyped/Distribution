package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRequestNode extends StObject {
  
  var deps: js.Array[IssuesRequestDep]
  
  var nodeId: String
  
  var pkgId: String
}
object IssuesRequestNode {
  
  inline def apply(deps: js.Array[IssuesRequestDep], nodeId: String, pkgId: String): IssuesRequestNode = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], pkgId = pkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRequestNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuesRequestNode] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[IssuesRequestDep]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: IssuesRequestDep*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPkgId(value: String): Self = StObject.set(x, "pkgId", value.asInstanceOf[js.Any])
  }
}
