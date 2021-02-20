package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousePressOptions extends StObject {
  
  /**
    * left, right, or middle.
    * @default left
    */
  var button: js.UndefOr[MouseButtons] = js.native
  
  /**
    * The number of clicks.
    * @default 1
    */
  var clickCount: js.UndefOr[Double] = js.native
}
object MousePressOptions {
  
  @scala.inline
  def apply(): MousePressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePressOptions]
  }
  
  @scala.inline
  implicit class MousePressOptionsMutableBuilder[Self <: MousePressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: MouseButtons): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
  }
}
