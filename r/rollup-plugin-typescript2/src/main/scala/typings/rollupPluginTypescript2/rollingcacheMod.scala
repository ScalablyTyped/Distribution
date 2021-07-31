package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.icacheMod.ICache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollingcacheMod {
  
  @JSImport("rollup-plugin-typescript2/dist/rollingcache", "RollingCache")
  @js.native
  class RollingCache[DataType] protected ()
    extends StObject
       with ICache[DataType] {
    /**
      * @param cacheRoot: root folder for the cache
      * @param checkNewCache: whether to also look in new cache when reading from cache
      */
    def this(cacheRoot: String, checkNewCache: Boolean) = this()
    
    var cacheRoot: js.Any = js.native
    
    var checkNewCache: js.Any = js.native
    
    /* CompleteClass */
    override def exists(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def `match`(names: js.Array[String]): Boolean = js.native
    
    var newCacheRoot: js.Any = js.native
    
    var oldCacheRoot: js.Any = js.native
    
    /* CompleteClass */
    override def path(name: String): String = js.native
    
    /* CompleteClass */
    override def read(name: String): js.UndefOr[DataType | Null] = js.native
    
    /* CompleteClass */
    override def roll(): Unit = js.native
    
    var rolled: js.Any = js.native
    
    /* CompleteClass */
    override def touch(name: String): Unit = js.native
    
    /* CompleteClass */
    override def write(name: String, data: DataType): Unit = js.native
  }
}
