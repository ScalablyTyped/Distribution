package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var userAgent: String
  
  var viewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
}
object Viewport {
  
  @scala.inline
  def apply(userAgent: String, viewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): Viewport = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
