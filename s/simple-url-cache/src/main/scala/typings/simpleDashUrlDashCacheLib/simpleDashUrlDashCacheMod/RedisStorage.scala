package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-url-cache", "RedisStorage")
@js.native
class RedisStorage protected ()
  extends simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs.CacheCategory
     with simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs.CacheStorage {
  def this(_url: java.lang.String, _storageConfig: RedisStorageConfig, _regexRules: CacheRules) = this()
  /* CompleteClass */
  /* private */ override def getCacheCategory(): java.lang.String = js.native
  /* CompleteClass */
  override def getCategory(): java.lang.String = js.native
  /* CompleteClass */
  override def getCurrentUrl(): java.lang.String = js.native
  /* CompleteClass */
  /* private */ override def getRegexTest(u: RegexRule): scala.Boolean = js.native
}

