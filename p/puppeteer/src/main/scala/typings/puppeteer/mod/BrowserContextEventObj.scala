package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserContextEventObj extends StObject {
  
  /** Emitted when the url of a target inside the browser context changes. */
  var targetchanged: Target
  
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browserContext.newPage`. */
  var targetcreated: Target
  
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target
}
object BrowserContextEventObj {
  
  inline def apply(targetchanged: Target, targetcreated: Target, targetdestroyed: Target): BrowserContextEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged.asInstanceOf[js.Any], targetcreated = targetcreated.asInstanceOf[js.Any], targetdestroyed = targetdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserContextEventObj]
  }
  
  extension [Self <: BrowserContextEventObj](x: Self) {
    
    inline def setTargetchanged(value: Target): Self = StObject.set(x, "targetchanged", value.asInstanceOf[js.Any])
    
    inline def setTargetcreated(value: Target): Self = StObject.set(x, "targetcreated", value.asInstanceOf[js.Any])
    
    inline def setTargetdestroyed(value: Target): Self = StObject.set(x, "targetdestroyed", value.asInstanceOf[js.Any])
  }
}
