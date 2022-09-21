package typings.rollup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupCache extends StObject {
  
  var modules: js.Array[ModuleJSON]
  
  var plugins: js.UndefOr[Record[String, SerializablePluginCache]] = js.undefined
}
object RollupCache {
  
  inline def apply(modules: js.Array[ModuleJSON]): RollupCache = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupCache]
  }
  
  extension [Self <: RollupCache](x: Self) {
    
    inline def setModules(value: js.Array[ModuleJSON]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: ModuleJSON*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setPlugins(value: Record[String, SerializablePluginCache]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
