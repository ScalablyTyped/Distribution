package typings.reactFloater.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/eventListeners.Options> */
trait PartialOptionsResize extends StObject {
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
}
object PartialOptionsResize {
  
  inline def apply(): PartialOptionsResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsResize]
  }
  
  extension [Self <: PartialOptionsResize](x: Self) {
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
