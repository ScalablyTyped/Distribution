package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-url-cache", "CacheEngine")
@js.native
class CacheEngine protected () extends js.Object {
  def this(storageConfig: FileStorageConfig, cacheRules: CacheRules) = this()
  def this(storageConfig: RedisStorageConfig, cacheRules: CacheRules) = this()
  def url(url: String): FileStorage = js.native
  @JSName("url")
  def url_RedisStorage(url: String): RedisStorage = js.native
}

