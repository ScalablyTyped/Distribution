package typings.simplecrawler

import typings.node.NodeJS.ErrnoException
import typings.simplecrawler.queueMod.QueueItem
import typings.simplecrawler.simplecrawlerBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheBackendFsMod {
  
  @JSImport("simplecrawler/cache-backend-fs", JSImport.Default)
  @js.native
  def default(): FSBackend = js.native
  @JSImport("simplecrawler/cache-backend-fs", JSImport.Default)
  @js.native
  def default(loadParameter: String): FSBackend = js.native
  
  @JSImport("simplecrawler/cache-backend-fs", "FSBackend")
  @js.native
  class FSBackend () extends StObject {
    
    def fileExists(location: String): Boolean = js.native
    
    def getItem(queueObject: QueueItem): `false` = js.native
    def getItem(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]
    ): `false` = js.native
    
    var index: js.Array[Double] = js.native
    
    def isDirectory(location: String): Boolean = js.native
    
    var laoded: Boolean = js.native
    
    def load(): Unit = js.native
    
    var location: String = js.native
    
    def saveCache(): Unit = js.native
    def saveCache(callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
    
    def setItem(queueObject: QueueItem, data: js.Any): Unit = js.native
    def setItem(queueObject: QueueItem, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
}
