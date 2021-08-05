package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11ForwardingConfig extends StObject {
  
  /**
    * The X11 authentication cookie encoded in hexadecimal.
    */
  var cookie: String
  
  /**
    * The name of the X11 authentication method used (e.g. MIT-MAGIC-COOKIE-1).
    */
  var protocol: String
  
  /**
    * The screen number to forward X11 connections for.
    */
  var screen: Double
  
  /**
    * true if only a single connection should be forwarded.
    */
  var single: Boolean
}
object X11ForwardingConfig {
  
  inline def apply(cookie: String, protocol: String, screen: Double, single: Boolean): X11ForwardingConfig = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ForwardingConfig]
  }
  
  extension [Self <: X11ForwardingConfig](x: Self) {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
  }
}
