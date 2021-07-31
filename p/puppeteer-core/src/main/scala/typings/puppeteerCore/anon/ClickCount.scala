package typings.puppeteerCore.anon

import typings.puppeteerCore.commonInputMod.MouseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickCount extends StObject {
  
  var button: js.UndefOr[MouseButton] = js.undefined
  
  var clickCount: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
}
object ClickCount {
  
  @scala.inline
  def apply(): ClickCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickCount]
  }
  
  @scala.inline
  implicit class ClickCountMutableBuilder[Self <: ClickCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
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
