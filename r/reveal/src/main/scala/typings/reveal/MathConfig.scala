package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#mathjax
trait MathConfig extends StObject {
  
  // Obtained from the socket.io server
  var config: String
  
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var mathjax: String
}
object MathConfig {
  
  inline def apply(config: String, mathjax: String): MathConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], mathjax = mathjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathConfig]
  }
  
  extension [Self <: MathConfig](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setMathjax(value: String): Self = StObject.set(x, "mathjax", value.asInstanceOf[js.Any])
  }
}
