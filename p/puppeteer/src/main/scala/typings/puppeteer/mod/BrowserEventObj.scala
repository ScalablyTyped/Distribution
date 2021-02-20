package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserEventObj extends StObject {
  
  /** Emitted when puppeteer gets disconnected from the browser instance. */
  var disconnected: js.UndefOr[scala.Nothing] = js.native
  
  /** Emitted when the url of a target changes. */
  var targetchanged: Target = js.native
  
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browser.newPage`. */
  var targetcreated: Target = js.native
  
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target = js.native
}
object BrowserEventObj {
  
  @scala.inline
  def apply(targetchanged: Target, targetcreated: Target, targetdestroyed: Target): BrowserEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged.asInstanceOf[js.Any], targetcreated = targetcreated.asInstanceOf[js.Any], targetdestroyed = targetdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserEventObj]
  }
  
  @scala.inline
  implicit class BrowserEventObjMutableBuilder[Self <: BrowserEventObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetchanged(value: Target): Self = StObject.set(x, "targetchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetcreated(value: Target): Self = StObject.set(x, "targetcreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetdestroyed(value: Target): Self = StObject.set(x, "targetdestroyed", value.asInstanceOf[js.Any])
  }
}
