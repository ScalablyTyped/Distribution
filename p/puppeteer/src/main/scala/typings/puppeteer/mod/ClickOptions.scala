package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickOptions extends StObject {
  
  /** @default MouseButtons.Left */
  var button: js.UndefOr[MouseButtons] = js.native
  
  /** @default 1 */
  var clickCount: js.UndefOr[Double] = js.native
  
  /**
    * Time to wait between mousedown and mouseup in milliseconds.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.native
}
object ClickOptions {
  
  @scala.inline
  def apply(): ClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickOptions]
  }
  
  @scala.inline
  implicit class ClickOptionsMutableBuilder[Self <: ClickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: MouseButtons): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
