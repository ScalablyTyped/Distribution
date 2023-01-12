package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11Info extends StObject {
  
  /** The X11 authentication cookie encoded in hexadecimal. */
  var cookie: String
  
  /** The name of the X11 authentication method used. */
  var protocol: String
  
  /** The screen number for which to forward X11 connections. */
  var screen: Double
  
  /** true if only a single connection should be forwarded. */
  var single: Boolean
}
object X11Info {
  
  inline def apply(cookie: String, protocol: String, screen: Double, single: Boolean): X11Info = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11Info]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X11Info] (val x: Self) extends AnyVal {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
  }
}
