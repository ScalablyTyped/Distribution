package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventListenerOptions extends EventListenerOptions {
  
  var once: js.UndefOr[scala.Boolean] = js.native
  
  var passive: js.UndefOr[scala.Boolean] = js.native
}
object AddEventListenerOptions {
  
  @scala.inline
  def apply(): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListenerOptions]
  }
  
  @scala.inline
  implicit class AddEventListenerOptionsMutableBuilder[Self <: AddEventListenerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: scala.Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setPassive(value: scala.Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
