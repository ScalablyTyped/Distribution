package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewAnimationOptions
  extends StObject
     with ScreenAnimationOptions {
  
  /**
    * ID of the Top Bar we want to animate
    */
  var id: js.UndefOr[String] = js.undefined
}
object ViewAnimationOptions {
  
  inline def apply(): ViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewAnimationOptions]
  }
  
  extension [Self <: ViewAnimationOptions](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
