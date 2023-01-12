package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOpenApi extends StObject {
  
  var node_id: String
}
object DepOpenApi {
  
  inline def apply(node_id: String): DepOpenApi = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepOpenApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepOpenApi] (val x: Self) extends AnyVal {
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
