package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11Options extends StObject {
  
  /** The authentication cookie. Can be a hex string or a Buffer containing the raw cookie value (which will be converted to a hex string). Default: (random 16 byte value) */
  var cookie: js.UndefOr[Buffer | String] = js.undefined
  
  /** The authentication protocol name. Default: 'MIT-MAGIC-COOKIE-1' */
  var protocol: js.UndefOr[String] = js.undefined
  
  /** The Screen number to use (default: `0`). */
  var screen: js.UndefOr[Double] = js.undefined
  
  /** Whether to allow just a single connection (default: `false`).*/
  var single: js.UndefOr[Boolean] = js.undefined
}
object X11Options {
  
  inline def apply(): X11Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X11Options]
  }
  
  extension [Self <: X11Options](x: Self) {
    
    inline def setCookie(value: Buffer | String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
  }
}
