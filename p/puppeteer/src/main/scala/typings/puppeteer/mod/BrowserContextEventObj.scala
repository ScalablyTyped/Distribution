package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserContextEventObj extends StObject {
  
  /** Emitted when the url of a target inside the browser context changes. */
  var targetchanged: Target = js.native
  
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browserContext.newPage`. */
  var targetcreated: Target = js.native
  
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target = js.native
}
object BrowserContextEventObj {
  
  @scala.inline
  def apply(targetchanged: Target, targetcreated: Target, targetdestroyed: Target): BrowserContextEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged.asInstanceOf[js.Any], targetcreated = targetcreated.asInstanceOf[js.Any], targetdestroyed = targetdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserContextEventObj]
  }
  
  @scala.inline
  implicit class BrowserContextEventObjMutableBuilder[Self <: BrowserContextEventObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetchanged(value: Target): Self = StObject.set(x, "targetchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetcreated(value: Target): Self = StObject.set(x, "targetcreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetdestroyed(value: Target): Self = StObject.set(x, "targetdestroyed", value.asInstanceOf[js.Any])
  }
}
