package typings
package simplecrawlerLib.cacheDashBackendDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplecrawler/cache-backend-fs", "FSBackend")
@js.native
class FSBackend () extends js.Object {
  var index: js.Array[scala.Double] = js.native
  var laoded: scala.Boolean = js.native
  var location: java.lang.String = js.native
  def fileExists(location: java.lang.String): scala.Boolean = js.native
  def getItem(queueObject: simplecrawlerLib.queueMod.QueueItem): simplecrawlerLib.simplecrawlerLibNumbers.`false` = js.native
  def getItem(
    queueObject: simplecrawlerLib.queueMod.QueueItem,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): simplecrawlerLib.simplecrawlerLibNumbers.`false` = js.native
  def isDirectory(location: java.lang.String): scala.Boolean = js.native
  def load(): scala.Unit = js.native
  def saveCache(): scala.Unit = js.native
  def saveCache(
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def setItem(queueObject: simplecrawlerLib.queueMod.QueueItem, data: js.Any): scala.Unit = js.native
  def setItem(queueObject: simplecrawlerLib.queueMod.QueueItem, data: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

