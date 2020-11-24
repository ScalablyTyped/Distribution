package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.icacheMod.ICache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rollup-plugin-typescript2/dist/rollingcache", JSImport.Namespace)
@js.native
object rollingcacheMod extends js.Object {
  
  @js.native
  class RollingCache[DataType] protected () extends ICache[DataType] {
    /**
      * @param cacheRoot: root folder for the cache
      * @param checkNewCache: whether to also look in new cache when reading from cache
      */
    def this(cacheRoot: String, checkNewCache: Boolean) = this()
    
    var cacheRoot: js.Any = js.native
    
    var checkNewCache: js.Any = js.native
    
    var newCacheRoot: js.Any = js.native
    
    var oldCacheRoot: js.Any = js.native
    
    var rolled: js.Any = js.native
  }
}
