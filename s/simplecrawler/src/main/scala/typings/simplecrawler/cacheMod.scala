package typings.simplecrawler

import typings.node.eventsMod.EventEmitter
import typings.simplecrawler.cacheBackendFsMod.FSBackend
import typings.simplecrawler.queueMod.QueueItem
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplecrawler/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  
  def FilesystemBackend(): FSBackend = js.native
  def FilesystemBackend(loadParameter: String): FSBackend = js.native
  
  @js.native
  class Cache protected () extends EventEmitter {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
    
    var datastore: FSBackend = js.native
    
    def getCacheData(queueObject: QueueItem): Unit = js.native
    def getCacheData(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    def saveCache(): Unit = js.native
    
    def setCacheData(queueObject: QueueItem, data: js.Any): Unit = js.native
    def setCacheData(queueObject: QueueItem, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  class default protected () extends Cache {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
  }
}
