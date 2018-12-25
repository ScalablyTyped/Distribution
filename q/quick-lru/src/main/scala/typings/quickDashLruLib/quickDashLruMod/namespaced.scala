package typings
package quickDashLruLib.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quick-lru", JSImport.Namespace)
@js.native
class namespaced[K, V] protected () extends QuickLRU[K, V] {
  def this(options: quickDashLruLib.quickDashLruMod.QuickLRUNs.Options) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[K, V]]] = js.native
  /* CompleteClass */
  override val size: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def delete(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def keys(): stdLib.Iterable[K] = js.native
  /* CompleteClass */
  override def peek(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def set(key: K, value: V): this.type = js.native
  /* CompleteClass */
  override def values(): stdLib.Iterable[V] = js.native
}

