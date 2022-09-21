package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgent extends StObject {
  
  var userAgent: String
  
  var viewport: typings.puppeteer.puppeteerViewportMod.Viewport
}
object UserAgent {
  
  inline def apply(userAgent: String, viewport: typings.puppeteer.puppeteerViewportMod.Viewport): UserAgent = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  
  extension [Self <: UserAgent](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: typings.puppeteer.puppeteerViewportMod.Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
