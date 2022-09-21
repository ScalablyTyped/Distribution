package typings.reactSelect.anon

import typings.reactSelect.menuMod.MenuState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalPlacement extends StObject {
  
  var getPortalPlacement: (js.Function1[/* menuState */ MenuState, Unit]) | Null
}
object GetPortalPlacement {
  
  inline def apply(): GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = null)
    __obj.asInstanceOf[GetPortalPlacement]
  }
  
  extension [Self <: GetPortalPlacement](x: Self) {
    
    inline def setGetPortalPlacement(value: /* menuState */ MenuState => Unit): Self = StObject.set(x, "getPortalPlacement", js.Any.fromFunction1(value))
    
    inline def setGetPortalPlacementNull: Self = StObject.set(x, "getPortalPlacement", null)
  }
}
