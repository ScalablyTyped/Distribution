package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRequestDep extends StObject {
  
  var nodeId: String
}
object IssuesRequestDep {
  
  inline def apply(nodeId: String): IssuesRequestDep = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRequestDep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuesRequestDep] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
