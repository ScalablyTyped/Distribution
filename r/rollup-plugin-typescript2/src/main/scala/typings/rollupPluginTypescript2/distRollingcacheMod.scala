package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.distIcacheMod.ICache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRollingcacheMod {
  
  @JSImport("rollup-plugin-typescript2/dist/rollingcache", "RollingCache")
  @js.native
  open class RollingCache[DataType] protected ()
    extends StObject
       with ICache[DataType] {
    /** @param cacheRoot: root folder for the cache */
    def this(cacheRoot: String) = this()
    
    /* private */ var cacheRoot: Any = js.native
    
    /* CompleteClass */
    override def exists(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def `match`(names: js.Array[String]): Boolean = js.native
    
    /* private */ var newCacheRoot: Any = js.native
    
    /* private */ var oldCacheRoot: Any = js.native
    
    /* CompleteClass */
    override def path(name: String): String = js.native
    
    /* CompleteClass */
    override def read(name: String): js.UndefOr[DataType | Null] = js.native
    
    /* CompleteClass */
    override def roll(): Unit = js.native
    
    /* private */ var rolled: Any = js.native
    
    /* CompleteClass */
    override def touch(name: String): Unit = js.native
    
    /* CompleteClass */
    override def write(name: String, data: DataType): Unit = js.native
  }
}
