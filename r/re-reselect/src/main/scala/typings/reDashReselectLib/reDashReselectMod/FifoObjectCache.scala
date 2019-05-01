package typings
package reDashReselectLib.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "FifoObjectCache")
@js.native
class FifoObjectCache protected () extends ICacheObject {
  def this(options: reDashReselectLib.Anon_CacheSize) = this()
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Any = js.native
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MFifoObjectCache(key: ObjectCacheKey): scala.Boolean = js.native
  /* CompleteClass */
  override def remove(key: js.Any): scala.Unit = js.native
  def remove(key: ObjectCacheKey): scala.Unit = js.native
  /* CompleteClass */
  override def set(key: js.Any, selectorFn: js.Any): scala.Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): scala.Unit = js.native
}

