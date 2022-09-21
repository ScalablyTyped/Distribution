package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressApp extends StObject {
  
  var use: js.UndefOr[js.Function] = js.undefined
}
object ExpressApp {
  
  inline def apply(): ExpressApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressApp]
  }
  
  extension [Self <: ExpressApp](x: Self) {
    
    inline def setUse(value: js.Function): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
