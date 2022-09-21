package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupResults extends StObject {
  
  var modules: js.Array[RollupResultModule]
}
object RollupResults {
  
  inline def apply(modules: js.Array[RollupResultModule]): RollupResults = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupResults]
  }
  
  extension [Self <: RollupResults](x: Self) {
    
    inline def setModules(value: js.Array[RollupResultModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: RollupResultModule*): Self = StObject.set(x, "modules", js.Array(value*))
  }
}
