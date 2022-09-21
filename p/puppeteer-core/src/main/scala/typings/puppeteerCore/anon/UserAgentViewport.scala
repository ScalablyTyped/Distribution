package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentViewport extends StObject {
  
  var userAgent: String
  
  var viewport: typings.puppeteerCore.mod.Viewport
}
object UserAgentViewport {
  
  inline def apply(userAgent: String, viewport: typings.puppeteerCore.mod.Viewport): UserAgentViewport = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentViewport]
  }
  
  extension [Self <: UserAgentViewport](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: typings.puppeteerCore.mod.Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
