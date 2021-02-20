package typings.restify.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
  var chain: Chain = js.native
  
  var method: String = js.native
  
  var name: String = js.native
  
  var path: String | RegExp = js.native
  
  var spec: RouteSpec = js.native
}
object Route {
  
  @scala.inline
  def apply(chain: Chain, method: String, name: String, path: String | RegExp, spec: RouteSpec): Route = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChain(value: Chain): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String | RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: RouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
