package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInit extends StObject {
  
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  
  var composed: js.UndefOr[scala.Boolean] = js.undefined
}
object EventInit {
  
  inline def apply(): EventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInit]
  }
  
  extension [Self <: EventInit](x: Self) {
    
    inline def setBubbles(value: scala.Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCancelable(value: scala.Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setComposed(value: scala.Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
