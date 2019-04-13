package typings
package quickDashLruLib.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickLRU[KeyType /* <: js.Any */, ValueType /* <: js.Any */]
  extends stdLib.Iterable[js.Tuple2[KeyType, ValueType]] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_QuickLRU: js.Function0[stdLib.IterableIterator[js.Tuple2[KeyType, ValueType]]] = js.native
  /**
  	 * The stored item count.
  	 */
  val size: scala.Double = js.native
  /**
  	 * Delete all items.
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * Delete an item.
  	 *
  	 * @returns `true` if the item is removed or `false` if the item doesn't exist.
  	 */
  def delete(key: KeyType): scala.Boolean = js.native
  /**
  	 * Get an item.
  	 *
  	 * @returns The stored item or `undefined`.
  	 */
  def get(key: KeyType): js.UndefOr[ValueType] = js.native
  /**
  	 * Check if an item exists.
  	 */
  def has(key: KeyType): scala.Boolean = js.native
  /**
  	 * Iterable for all the keys.
  	 */
  def keys(): stdLib.IterableIterator[KeyType] = js.native
  /**
  	 * Get an item without marking it as recently used.
  	 *
  	 * @returns The stored item or `undefined`.
  	 */
  def peek(key: KeyType): js.UndefOr[ValueType] = js.native
  /**
  	 * Set an item.
  	 *
  	 * @returns The list instance.
  	 */
  def set(key: KeyType, value: ValueType): this.type = js.native
  /**
  	 * Iterable for all the values.
  	 */
  def values(): stdLib.IterableIterator[ValueType] = js.native
}

