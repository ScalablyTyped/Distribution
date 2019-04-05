package typings
package quickDashLruLib.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quick-lru", JSImport.Namespace)
@js.native
class namespaced[KeyType /* <: js.Any */, ValueType /* <: js.Any */] protected () extends QuickLRU[KeyType, ValueType] {
  /**
  	Simple ["Least Recently Used" (LRU) cache](https://en.m.wikipedia.org/wiki/Cache_replacement_policies#Least_Recently_Used_.28LRU.29).
  	The instance is [`iterable`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Iteration_protocols) so you can use it directly in a [`for…of`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Statements/for...of) loop.
  	@example
  	```
  	import QuickLRU = require('quick-lru');
  	const lru = new QuickLRU({maxSize: 1000});
  	lru.set('🦄', '🌈');
  	lru.has('🦄');
  	//=> true
  	lru.get('🦄');
  	//=> '🌈'
  	```
  	*/
  def this(options: quickDashLruLib.quickDashLruMod.QuickLRUNs.Options) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[KeyType, ValueType]]] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator_QuickLRU: js.Function0[stdLib.IterableIterator[js.Tuple2[KeyType, ValueType]]] = js.native
  /**
  	The stored item count.
  	*/
  /* CompleteClass */
  override val size: scala.Double = js.native
  /**
  	Delete all items.
  	*/
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
  	Delete an item.
  	@returns `true` if the item is removed or `false` if the item doesn't exist.
  	*/
  /* CompleteClass */
  override def delete(key: KeyType): scala.Boolean = js.native
  /**
  	Get an item.
  	@returns The stored item or `undefined`.
  	*/
  /* CompleteClass */
  override def get(key: KeyType): js.UndefOr[ValueType] = js.native
  /**
  	Check if an item exists.
  	*/
  /* CompleteClass */
  override def has(key: KeyType): scala.Boolean = js.native
  /**
  	Iterable for all the keys.
  	*/
  /* CompleteClass */
  override def keys(): stdLib.IterableIterator[KeyType] = js.native
  /**
  	Get an item without marking it as recently used.
  	@returns The stored item or `undefined`.
  	*/
  /* CompleteClass */
  override def peek(key: KeyType): js.UndefOr[ValueType] = js.native
  /**
  	Set an item.
  	@returns The list instance.
  	*/
  /* CompleteClass */
  override def set(key: KeyType, value: ValueType): this.type = js.native
  /**
  	Iterable for all the values.
  	*/
  /* CompleteClass */
  override def values(): stdLib.IterableIterator[ValueType] = js.native
}

