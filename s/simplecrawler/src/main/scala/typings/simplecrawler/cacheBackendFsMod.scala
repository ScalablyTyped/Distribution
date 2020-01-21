package typings.simplecrawler

import typings.node.NodeJS.ErrnoException
import typings.simplecrawler.queueMod.QueueItem
import typings.simplecrawler.simplecrawlerBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplecrawler/cache-backend-fs", JSImport.Namespace)
@js.native
object cacheBackendFsMod extends js.Object {
  @js.native
  class FSBackend () extends js.Object {
    var index: js.Array[Double] = js.native
    var laoded: Boolean = js.native
    var location: String = js.native
    def fileExists(location: String): Boolean = js.native
    def getItem(queueObject: QueueItem): `false` = js.native
    def getItem(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]
    ): `false` = js.native
    def isDirectory(location: String): Boolean = js.native
    def load(): Unit = js.native
    def saveCache(): Unit = js.native
    def saveCache(callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
    def setItem(queueObject: QueueItem, data: js.Any): Unit = js.native
    def setItem(queueObject: QueueItem, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  def default(): FSBackend = js.native
  def default(loadParameter: String): FSBackend = js.native
}

