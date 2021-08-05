package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var userAgent: String
  
  var viewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
}
object Viewport {
  
  inline def apply(userAgent: String, viewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): Viewport = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
