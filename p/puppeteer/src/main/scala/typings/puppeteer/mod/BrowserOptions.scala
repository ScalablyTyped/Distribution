package typings.puppeteer.mod

import typings.puppeteer.anon.HasTouch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserOptions extends StObject {
  
  /**
    * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
    */
  var defaultViewport: js.UndefOr[HasTouch | Null] = js.undefined
  
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @default false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var slowMo: js.UndefOr[Double] = js.undefined
}
object BrowserOptions {
  
  inline def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  
  extension [Self <: BrowserOptions](x: Self) {
    
    inline def setDefaultViewport(value: HasTouch): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewportNull: Self = StObject.set(x, "defaultViewport", null)
    
    inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
    
    inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
  }
}
