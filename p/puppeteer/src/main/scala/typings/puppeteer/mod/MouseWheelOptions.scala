package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelOptions extends StObject {
  
  var deltaX: js.UndefOr[Double] = js.native
  
  var deltaY: js.UndefOr[Double] = js.native
}
object MouseWheelOptions {
  
  @scala.inline
  def apply(): MouseWheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelOptions]
  }
  
  @scala.inline
  implicit class MouseWheelOptionsMutableBuilder[Self <: MouseWheelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
  }
}
