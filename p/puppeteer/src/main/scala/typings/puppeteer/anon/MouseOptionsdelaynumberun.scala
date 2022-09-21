package typings.puppeteer.anon

import typings.puppeteer.inputMod.MouseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer.puppeteer/lib/cjs/puppeteer/common/Input.MouseOptions & {  delay :number | undefined} */
trait MouseOptionsdelaynumberun extends StObject {
  
  var button: js.UndefOr[MouseButton] = js.undefined
  
  var clickCount: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
}
object MouseOptionsdelaynumberun {
  
  inline def apply(): MouseOptionsdelaynumberun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseOptionsdelaynumberun]
  }
  
  extension [Self <: MouseOptionsdelaynumberun](x: Self) {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
