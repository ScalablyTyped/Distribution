package typings.reactLoadingOverlay

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: js.UndefOr[js.Function1[/* base */ CSSProperties, CSSProperties]] = js.undefined
    
    var overlay: js.UndefOr[js.Function1[/* base */ CSSProperties, CSSProperties]] = js.undefined
    
    var spinner: js.UndefOr[js.Function1[/* base */ CSSProperties, CSSProperties]] = js.undefined
    
    var wrapper: js.UndefOr[js.Function1[/* base */ CSSProperties, CSSProperties]] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: /* base */ CSSProperties => CSSProperties): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOverlay(value: /* base */ CSSProperties => CSSProperties): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setSpinner(value: /* base */ CSSProperties => CSSProperties): Self = StObject.set(x, "spinner", js.Any.fromFunction1(value))
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setWrapper(value: /* base */ CSSProperties => CSSProperties): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
