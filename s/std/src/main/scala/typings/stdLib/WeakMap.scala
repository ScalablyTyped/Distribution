package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def set(key: K, value: V): this.type
}

@JSGlobal("WeakMap")
@js.native
class WeakMapCls[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  override val toStringTag: java.lang.String = js.native
  /* CompleteClass */
  override def delete(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def set(key: K, value: V): this.type = js.native
}

object WeakMap {
  @scala.inline
  def apply[K /* <: js.Object */, V](
    delete: K => scala.Boolean,
    get: K => js.UndefOr[V],
    has: K => scala.Boolean,
    set: (K, V) => WeakMap[K, V],
    toStringTag: java.lang.String
  ): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), toStringTag = toStringTag)
  
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}

