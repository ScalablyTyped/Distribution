package typings
package simplecrawlerLib.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplecrawler/cache", "Cache")
@js.native
class Cache protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(cacheLoadParameter: js.Array[java.lang.String], cacheBackend: js.Function0[scala.Unit]) = this()
  var datastore: simplecrawlerLib.cacheDashBackendDashFsMod.FSBackend = js.native
  def getCacheData(queueObject: simplecrawlerLib.queueMod.QueueItem): scala.Unit = js.native
  def getCacheData(
    queueObject: simplecrawlerLib.queueMod.QueueItem,
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def saveCache(): scala.Unit = js.native
  def setCacheData(queueObject: simplecrawlerLib.queueMod.QueueItem, data: js.Any): scala.Unit = js.native
  def setCacheData(queueObject: simplecrawlerLib.queueMod.QueueItem, data: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

