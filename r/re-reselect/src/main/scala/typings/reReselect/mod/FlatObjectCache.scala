package typings.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "FlatObjectCache")
@js.native
class FlatObjectCache () extends ICacheObject {
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MFlatObjectCache(key: ObjectCacheKey): Boolean = js.native
  def remove(key: ObjectCacheKey): Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
}

