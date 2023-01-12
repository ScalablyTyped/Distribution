package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitForSelectorOptions extends StObject {
  
  /**
    * Wait for the selected element to not be found in the DOM or to be hidden,
    * i.e. have `display: none` or `visibility: hidden` CSS properties.
    *
    * @defaultValue `false`
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum time to wait in milliseconds. Pass `0` to disable timeout.
    *
    * The default value can be changed by using {@link Page.setDefaultTimeout}
    *
    * @defaultValue `30000` (30 seconds)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Wait for the selected element to be present in DOM and to be visible, i.e.
    * to not have `display: none` or `visibility: hidden` CSS properties.
    *
    * @defaultValue `false`
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WaitForSelectorOptions {
  
  inline def apply(): WaitForSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForSelectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitForSelectorOptions] (val x: Self) extends AnyVal {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
