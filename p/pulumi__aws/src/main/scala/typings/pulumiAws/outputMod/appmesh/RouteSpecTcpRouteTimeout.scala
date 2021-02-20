package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecTcpRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[RouteSpecTcpRouteTimeoutIdle] = js.native
}
object RouteSpecTcpRouteTimeout {
  
  @scala.inline
  def apply(): RouteSpecTcpRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecTcpRouteTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecTcpRouteTimeoutMutableBuilder[Self <: RouteSpecTcpRouteTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: RouteSpecTcpRouteTimeoutIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}
