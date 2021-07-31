package typings.resizeObserverBrowser

import typings.resizeObserverBrowser.resizeObserverBrowserStrings.`border-box`
import typings.resizeObserverBrowser.resizeObserverBrowserStrings.`content-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverOptions extends StObject {
  
  /**
    * Sets which box model the observer will observe changes to. Possible values
    * are `content-box` (the default), and `border-box`.
    *
    * @default 'content-box'
    */
  var box: js.UndefOr[`content-box` | `border-box`] = js.undefined
}
object ResizeObserverOptions {
  
  @scala.inline
  def apply(): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverOptions]
  }
  
  @scala.inline
  implicit class ResizeObserverOptionsMutableBuilder[Self <: ResizeObserverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBox(value: `content-box` | `border-box`): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
  }
}
