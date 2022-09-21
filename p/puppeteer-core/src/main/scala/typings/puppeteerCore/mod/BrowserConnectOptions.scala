package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserConnectOptions extends StObject {
  
  /**
    * Sets the viewport for each page.
    */
  var defaultViewport: js.UndefOr[Viewport | Null] = js.undefined
  
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @defaultValue false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds to
    * aid debugging.
    */
  var slowMo: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback to decide if Puppeteer should connect to a given target or not.
    */
  var targetFilter: js.UndefOr[TargetFilterCallback] = js.undefined
}
object BrowserConnectOptions {
  
  inline def apply(): BrowserConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserConnectOptions]
  }
  
  extension [Self <: BrowserConnectOptions](x: Self) {
    
    inline def setDefaultViewport(value: Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewportNull: Self = StObject.set(x, "defaultViewport", null)
    
    inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
    
    inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    
    inline def setTargetFilter(value: /* target */ TargetInfo => Boolean): Self = StObject.set(x, "targetFilter", js.Any.fromFunction1(value))
    
    inline def setTargetFilterUndefined: Self = StObject.set(x, "targetFilter", js.undefined)
  }
}
