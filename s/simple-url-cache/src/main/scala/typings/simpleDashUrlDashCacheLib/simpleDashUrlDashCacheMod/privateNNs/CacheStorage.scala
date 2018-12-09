package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage extends js.Object {
  def cache(html: java.lang.String): js.Promise[scala.Boolean] = js.native
  def cache(html: java.lang.String, force: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def destroy(): scala.Unit = js.native
  def getUrl(): js.Promise[java.lang.String] = js.native
  def isCached(): js.Promise[scala.Boolean] = js.native
  def removeUrl(): js.Promise[scala.Boolean] = js.native
}

