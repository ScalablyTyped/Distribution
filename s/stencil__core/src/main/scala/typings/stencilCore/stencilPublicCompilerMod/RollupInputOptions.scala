package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupInputOptions extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var moduleContext: js.UndefOr[(js.Function1[/* id */ String, String]) | StringDictionary[String]] = js.undefined
  
  var treeshake: js.UndefOr[Boolean] = js.undefined
}
object RollupInputOptions {
  
  inline def apply(): RollupInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupInputOptions]
  }
  
  extension [Self <: RollupInputOptions](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setModuleContext(value: (js.Function1[/* id */ String, String]) | StringDictionary[String]): Self = StObject.set(x, "moduleContext", value.asInstanceOf[js.Any])
    
    inline def setModuleContextFunction1(value: /* id */ String => String): Self = StObject.set(x, "moduleContext", js.Any.fromFunction1(value))
    
    inline def setModuleContextUndefined: Self = StObject.set(x, "moduleContext", js.undefined)
    
    inline def setTreeshake(value: Boolean): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
    
    inline def setTreeshakeUndefined: Self = StObject.set(x, "treeshake", js.undefined)
  }
}
