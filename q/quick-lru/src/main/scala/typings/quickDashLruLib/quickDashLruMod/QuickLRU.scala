package typings
package quickDashLruLib.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickLRU[KeyType /* <: js.Any */, ValueType /* <: js.Any */]
  extends stdLib.Iterable[js.Tuple2[KeyType, ValueType]] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_QuickLRU: js.Function0[stdLib.IterableIterator[js.Tuple2[KeyType, ValueType]]]
  /**
  	The stored item count.
  	*/
  val size: scala.Double
  /**
  	Delete all items.
  	*/
  def clear(): scala.Unit
  /**
  	Delete an item.
  	@returns `true` if the item is removed or `false` if the item doesn't exist.
  	*/
  def delete(key: KeyType): scala.Boolean
  /**
  	Get an item.
  	@returns The stored item or `undefined`.
  	*/
  def get(key: KeyType): js.UndefOr[ValueType]
  /**
  	Check if an item exists.
  	*/
  def has(key: KeyType): scala.Boolean
  /**
  	Iterable for all the keys.
  	*/
  def keys(): stdLib.IterableIterator[KeyType]
  /**
  	Get an item without marking it as recently used.
  	@returns The stored item or `undefined`.
  	*/
  def peek(key: KeyType): js.UndefOr[ValueType]
  /**
  	Set an item.
  	@returns The list instance.
  	*/
  def set(key: KeyType, value: ValueType): this.type
  /**
  	Iterable for all the values.
  	*/
  def values(): stdLib.IterableIterator[ValueType]
}

object QuickLRU {
  @scala.inline
  def apply[KeyType /* <: js.Any */, ValueType /* <: js.Any */](
    clear: () => scala.Unit,
    delete: KeyType => scala.Boolean,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => scala.Boolean,
    iterator: () => stdLib.IterableIterator[js.Tuple2[KeyType, ValueType]],
    keys: () => stdLib.IterableIterator[KeyType],
    peek: KeyType => js.UndefOr[ValueType],
    set: (KeyType, ValueType) => QuickLRU[KeyType, ValueType],
    size: scala.Double,
    values: () => stdLib.IterableIterator[ValueType]
  ): QuickLRU[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), iterator = js.Any.fromFunction0(iterator), keys = js.Any.fromFunction0(keys), peek = js.Any.fromFunction1(peek), set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[QuickLRU[KeyType, ValueType]]
  }
}

