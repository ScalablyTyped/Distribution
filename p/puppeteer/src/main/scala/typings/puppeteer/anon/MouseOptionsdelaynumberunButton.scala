package typings.puppeteer.anon

import typings.puppeteer.commonInputMod.MouseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer.puppeteer/lib/esm/puppeteer/common/Input.MouseOptions & {  delay :number | undefined} */
trait MouseOptionsdelaynumberunButton extends StObject {
  
  var button: js.UndefOr[MouseButton] = js.undefined
  
  var clickCount: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
}
object MouseOptionsdelaynumberunButton {
  
  inline def apply(): MouseOptionsdelaynumberunButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseOptionsdelaynumberunButton]
  }
  
  extension [Self <: MouseOptionsdelaynumberunButton](x: Self) {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
