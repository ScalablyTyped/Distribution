package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleComponent extends StObject {
  
  var ripple: js.UndefOr[Boolean] = js.undefined
}
object RippleComponent {
  
  @scala.inline
  def apply(): RippleComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleComponent]
  }
  
  @scala.inline
  implicit class RippleComponentMutableBuilder[Self <: RippleComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
  }
}
