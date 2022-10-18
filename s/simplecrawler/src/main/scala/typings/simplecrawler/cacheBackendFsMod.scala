package typings.simplecrawler

import typings.node.NodeJS.ErrnoException
import typings.simplecrawler.queueMod.QueueItem
import typings.simplecrawler.simplecrawlerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheBackendFsMod {
  
  @JSImport("simplecrawler/cache-backend-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): FSBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[FSBackend]
  inline def default(loadParameter: String): FSBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(loadParameter.asInstanceOf[js.Any]).asInstanceOf[FSBackend]
  
  @JSImport("simplecrawler/cache-backend-fs", "FSBackend")
  @js.native
  open class FSBackend () extends StObject {
    
    def fileExists(location: String): Boolean = js.native
    
    def getItem(queueObject: QueueItem): `false` = js.native
    def getItem(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[Any], Unit]
    ): `false` = js.native
    
    var index: js.Array[Double] = js.native
    
    def isDirectory(location: String): Boolean = js.native
    
    var laoded: Boolean = js.native
    
    def load(): Unit = js.native
    
    var location: String = js.native
    
    def saveCache(): Unit = js.native
    def saveCache(callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
    
    def setItem(queueObject: QueueItem, data: Any): Unit = js.native
    def setItem(queueObject: QueueItem, data: Any, callback: js.Function0[Unit]): Unit = js.native
  }
}
