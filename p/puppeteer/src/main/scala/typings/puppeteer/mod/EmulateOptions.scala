package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulateOptions extends StObject {
  
  /** The emulated user-agent. */
  var userAgent: String
  
  /** The viewport emulation options. */
  var viewport: Viewport
}
object EmulateOptions {
  
  inline def apply(userAgent: String, viewport: Viewport): EmulateOptions = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateOptions]
  }
  
  extension [Self <: EmulateOptions](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
