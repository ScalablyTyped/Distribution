package typings.reReselect.mod

import typings.reReselect.anon.CacheSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "LruObjectCache")
@js.native
class LruObjectCache protected () extends ICacheObject {
  def this(options: CacheSize) = this()
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MLruObjectCache(key: ObjectCacheKey): Boolean = js.native
  def remove(key: ObjectCacheKey): Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
}

