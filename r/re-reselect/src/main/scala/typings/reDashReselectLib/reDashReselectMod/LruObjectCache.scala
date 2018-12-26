package typings
package reDashReselectLib.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "LruObjectCache")
@js.native
class LruObjectCache protected () extends ICacheObject {
  def this(options: reDashReselectLib.Anon_CacheSize) = this()
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Any = js.native
  def get(key: reDashReselectLib.ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MLruObjectCache(key: reDashReselectLib.ObjectCacheKey): scala.Boolean = js.native
  /* CompleteClass */
  override def remove(key: js.Any): scala.Unit = js.native
  def remove(key: reDashReselectLib.ObjectCacheKey): scala.Unit = js.native
  /* CompleteClass */
  override def set(key: js.Any, selectorFn: js.Any): scala.Unit = js.native
  def set(key: reDashReselectLib.ObjectCacheKey, selectorFn: js.Any): scala.Unit = js.native
}

