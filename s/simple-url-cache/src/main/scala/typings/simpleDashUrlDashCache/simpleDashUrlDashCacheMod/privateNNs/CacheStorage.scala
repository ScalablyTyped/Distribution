package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod.privateNNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage extends js.Object {
  def cache(html: String): js.Promise[Boolean] = js.native
  def cache(html: String, force: Boolean): js.Promise[Boolean] = js.native
  def destroy(): Unit = js.native
  def getUrl(): js.Promise[String] = js.native
  def isCached(): js.Promise[Boolean] = js.native
  def removeUrl(): js.Promise[Boolean] = js.native
}

