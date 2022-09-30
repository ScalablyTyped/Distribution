package typings.reactNativeWindows.rntypesMod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedComponentOptions extends StObject {
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
}
object AnimatedComponentOptions {
  
  inline def apply(): AnimatedComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedComponentOptions]
  }
  
  extension [Self <: AnimatedComponentOptions](x: Self) {
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
  }
}
