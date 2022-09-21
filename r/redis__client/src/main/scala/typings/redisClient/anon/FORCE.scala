package typings.redisClient.anon

import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FORCE extends StObject {
  
  var FORCE: js.UndefOr[`true`] = js.undefined
  
  var host: String
  
  var port: Double
}
object FORCE {
  
  inline def apply(host: String, port: Double): FORCE = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[FORCE]
  }
  
  extension [Self <: FORCE](x: Self) {
    
    inline def setFORCE(value: `true`): Self = StObject.set(x, "FORCE", value.asInstanceOf[js.Any])
    
    inline def setFORCEUndefined: Self = StObject.set(x, "FORCE", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
