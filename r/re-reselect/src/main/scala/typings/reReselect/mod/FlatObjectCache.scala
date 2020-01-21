package typings.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "FlatObjectCache")
@js.native
class FlatObjectCache () extends ICacheObject {
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Any = js.native
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MFlatObjectCache(key: ObjectCacheKey): Boolean = js.native
  /* CompleteClass */
  override def remove(key: js.Any): Unit = js.native
  def remove(key: ObjectCacheKey): Unit = js.native
  /* CompleteClass */
  override def set(key: js.Any, selectorFn: js.Any): Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
}

