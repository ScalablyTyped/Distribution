package typings.restify.mod.plugins

import typings.restify.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflightRequestThrottleOptions extends StObject {
  
  var err: js.Any = js.native
  
  var limit: Double = js.native
  
  var server: Server = js.native
}
object InflightRequestThrottleOptions {
  
  @scala.inline
  def apply(err: js.Any, limit: Double, server: Server): InflightRequestThrottleOptions = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
  
  @scala.inline
  implicit class InflightRequestThrottleOptionsMutableBuilder[Self <: InflightRequestThrottleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErr(value: js.Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
