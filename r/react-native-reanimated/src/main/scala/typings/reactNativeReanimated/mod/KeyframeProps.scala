package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeProps
  extends StObject
     with StyleProps {
  
  var easing: js.UndefOr[EasingFn] = js.undefined
}
object KeyframeProps {
  
  inline def apply(): KeyframeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeProps]
  }
  
  extension [Self <: KeyframeProps](x: Self) {
    
    inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
