package typings.simplecrawler

import typings.node.eventsMod.EventEmitter
import typings.simplecrawler.cacheBackendFsMod.FSBackend
import typings.simplecrawler.queueMod.QueueItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("simplecrawler/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("simplecrawler/cache", JSImport.Default)
  @js.native
  open class default protected () extends Cache {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
  }
  
  @JSImport("simplecrawler/cache", "Cache")
  @js.native
  open class Cache protected () extends EventEmitter {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
    
    var datastore: FSBackend = js.native
    
    def getCacheData(queueObject: QueueItem): Unit = js.native
    def getCacheData(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def saveCache(): Unit = js.native
    
    def setCacheData(queueObject: QueueItem, data: Any): Unit = js.native
    def setCacheData(queueObject: QueueItem, data: Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  inline def FilesystemBackend(): FSBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("FilesystemBackend")().asInstanceOf[FSBackend]
  inline def FilesystemBackend(loadParameter: String): FSBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("FilesystemBackend")(loadParameter.asInstanceOf[js.Any]).asInstanceOf[FSBackend]
}
