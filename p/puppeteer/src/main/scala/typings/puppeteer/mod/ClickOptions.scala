package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOptions extends StObject {
  
  /** @default MouseButtons.Left */
  var button: js.UndefOr[MouseButtons] = js.undefined
  
  /** @default 1 */
  var clickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Time to wait between mousedown and mouseup in milliseconds.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
}
object ClickOptions {
  
  inline def apply(): ClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickOptions]
  }
  
  extension [Self <: ClickOptions](x: Self) {
    
    inline def setButton(value: MouseButtons): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
