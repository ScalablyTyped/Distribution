package typings.reactOverlays.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventScroll extends StObject {
  
  var preventScroll: Boolean
}
object PreventScroll {
  
  inline def apply(preventScroll: Boolean): PreventScroll = {
    val __obj = js.Dynamic.literal(preventScroll = preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventScroll]
  }
  
  extension [Self <: PreventScroll](x: Self) {
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
  }
}
