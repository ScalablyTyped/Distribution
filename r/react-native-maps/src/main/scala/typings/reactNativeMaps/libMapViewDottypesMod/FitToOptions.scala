package typings.reactNativeMaps.libMapViewDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitToOptions extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var edgePadding: js.UndefOr[EdgePadding] = js.undefined
}
object FitToOptions {
  
  inline def apply(): FitToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitToOptions]
  }
  
  extension [Self <: FitToOptions](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setEdgePadding(value: EdgePadding): Self = StObject.set(x, "edgePadding", value.asInstanceOf[js.Any])
    
    inline def setEdgePaddingUndefined: Self = StObject.set(x, "edgePadding", js.undefined)
  }
}
