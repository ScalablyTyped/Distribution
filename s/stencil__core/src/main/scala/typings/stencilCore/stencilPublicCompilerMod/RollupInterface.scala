package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupInterface extends StObject {
  
  var plugins: Json
  
  def rollup(config: Any): js.Promise[Any]
}
object RollupInterface {
  
  inline def apply(plugins: Json, rollup: Any => js.Promise[Any]): RollupInterface = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], rollup = js.Any.fromFunction1(rollup))
    __obj.asInstanceOf[RollupInterface]
  }
  
  extension [Self <: RollupInterface](x: Self) {
    
    inline def setPlugins(value: Json): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setRollup(value: Any => js.Promise[Any]): Self = StObject.set(x, "rollup", js.Any.fromFunction1(value))
  }
}
