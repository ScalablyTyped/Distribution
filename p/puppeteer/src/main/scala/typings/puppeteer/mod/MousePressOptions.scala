package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MousePressOptions extends StObject {
  
  /**
    * left, right, or middle.
    * @default left
    */
  var button: js.UndefOr[MouseButtons] = js.undefined
  
  /**
    * The number of clicks.
    * @default 1
    */
  var clickCount: js.UndefOr[Double] = js.undefined
}
object MousePressOptions {
  
  inline def apply(): MousePressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePressOptions]
  }
  
  extension [Self <: MousePressOptions](x: Self) {
    
    inline def setButton(value: MouseButtons): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
  }
}
