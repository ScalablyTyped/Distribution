package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-url-cache", "CacheEngine")
@js.native
class CacheEngine protected () extends js.Object {
  def this(storageConfig: FileStorageConfig, cacheRules: CacheRules) = this()
  def this(storageConfig: RedisStorageConfig, cacheRules: CacheRules) = this()
  def url(url: java.lang.String): FileStorage = js.native
  @JSName("url")
  def url_RedisStorage(url: java.lang.String): RedisStorage = js.native
}

