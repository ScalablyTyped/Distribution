package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[RouteSpecHttp2RouteTimeoutIdle]] = js.native
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[RouteSpecHttp2RouteTimeoutPerRequest]] = js.native
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
    def setIdle(value: Input[RouteSpecHttp2RouteTimeoutIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[RouteSpecHttp2RouteTimeoutPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
