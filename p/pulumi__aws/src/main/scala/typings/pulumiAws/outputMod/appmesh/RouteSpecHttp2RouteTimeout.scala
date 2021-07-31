package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[RouteSpecHttp2RouteTimeoutIdle] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[RouteSpecHttp2RouteTimeoutPerRequest] = js.undefined
}
object RouteSpecHttp2RouteTimeout {
  
  @scala.inline
  def apply(): RouteSpecHttp2RouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecHttp2RouteTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteTimeoutMutableBuilder[Self <: RouteSpecHttp2RouteTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: RouteSpecHttp2RouteTimeoutIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: RouteSpecHttp2RouteTimeoutPerRequest): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
