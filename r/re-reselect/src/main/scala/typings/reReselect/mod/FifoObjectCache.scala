package typings.reReselect.mod

import typings.reReselect.anon.CacheSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "FifoObjectCache")
@js.native
class FifoObjectCache protected () extends ICacheObject {
  def this(options: CacheSize) = this()
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Any = js.native
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MFifoObjectCache(key: ObjectCacheKey): Boolean = js.native
  /* CompleteClass */
  override def remove(key: js.Any): Unit = js.native
  def remove(key: ObjectCacheKey): Unit = js.native
  /* CompleteClass */
  override def set(key: js.Any, selectorFn: js.Any): Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
}

