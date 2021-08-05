package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#multiplexing
trait MultiplexConfig extends StObject {
  
  // Obtained from the socket.io server
  var id: String
  
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var secret: js.UndefOr[String] = js.undefined
  
  // Location of socket.io server
  var url: String
}
object MultiplexConfig {
  
  inline def apply(id: String, url: String): MultiplexConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexConfig]
  }
  
  extension [Self <: MultiplexConfig](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
