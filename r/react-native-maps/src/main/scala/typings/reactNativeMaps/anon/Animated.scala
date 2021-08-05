package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.EdgePadding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var edgePadding: js.UndefOr[EdgePadding] = js.undefined
}
object Animated {
  
  inline def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setEdgePadding(value: EdgePadding): Self = StObject.set(x, "edgePadding", value.asInstanceOf[js.Any])
    
    inline def setEdgePaddingUndefined: Self = StObject.set(x, "edgePadding", js.undefined)
  }
}
