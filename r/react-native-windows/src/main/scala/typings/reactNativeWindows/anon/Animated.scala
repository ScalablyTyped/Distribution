package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: js.UndefOr[Boolean | Null] = js.undefined
}
object Animated {
  
  inline def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedNull: Self = StObject.set(x, "animated", null)
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}
