package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNative.mod.ImageRequireSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSystemSource extends StObject {
  
  var fallback: js.UndefOr[ImageRequireSource | String] = js.undefined
  
  var system: String
}
object ImageSystemSource {
  
  inline def apply(system: String): ImageSystemSource = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSystemSource]
  }
  
  extension [Self <: ImageSystemSource](x: Self) {
    
    inline def setFallback(value: ImageRequireSource | String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
