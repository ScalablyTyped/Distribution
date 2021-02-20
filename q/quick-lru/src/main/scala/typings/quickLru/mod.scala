package typings.quickLru

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quick-lru", JSImport.Namespace)
  @js.native
  class ^[KeyType, ValueType] protected () extends QuickLRU[KeyType, ValueType] {
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
    def this(options: Options[KeyType, ValueType]) = this()
  }
  
  @js.native
  trait Options[KeyType, ValueType] extends StObject {
    
    /**
    		The maximum number of items before evicting the least recently used items.
    		*/
    val maxSize: Double = js.native
    
    /**
    		Called right before an item is evicted from the cache.
    		Useful for side effects or for items like object URLs that need explicit cleanup (`revokeObjectURL`).
    		*/
    var onEviction: js.UndefOr[js.Function2[/* key */ KeyType, /* value */ ValueType, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[KeyType, ValueType](maxSize: Double): Options[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[KeyType, ValueType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], KeyType, ValueType] (val x: Self with (Options[KeyType, ValueType])) extends AnyVal {
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEviction(value: (/* key */ KeyType, /* value */ ValueType) => Unit): Self = StObject.set(x, "onEviction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEvictionUndefined: Self = StObject.set(x, "onEviction", js.undefined)
    }
  }
  
  @js.native
  trait QuickLRU[KeyType, ValueType]
    extends Iterable[js.Tuple2[KeyType, ValueType]] {
    
    /**
    	Delete all items.
    	*/
    def clear(): Unit = js.native
    
    /**
    	Delete an item.
    	@returns `true` if the item is removed or `false` if the item doesn't exist.
    	*/
    def delete(key: KeyType): Boolean = js.native
    
    /**
    	Get an item.
    	@returns The stored item or `undefined`.
    	*/
    def get(key: KeyType): js.UndefOr[ValueType] = js.native
    
    /**
    	Check if an item exists.
    	*/
    def has(key: KeyType): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_QuickLRU: js.Function0[IterableIterator[js.Tuple2[KeyType, ValueType]]] = js.native
    
    /**
    	Iterable for all the keys.
    	*/
    def keys(): IterableIterator[KeyType] = js.native
    
    /**
    	Get an item without marking it as recently used.
    	@returns The stored item or `undefined`.
    	*/
    def peek(key: KeyType): js.UndefOr[ValueType] = js.native
    
    /**
    	Set an item.
    	@returns The list instance.
    	*/
    def set(key: KeyType, value: ValueType): this.type = js.native
    
    /**
    	The stored item count.
    	*/
    val size: Double = js.native
    
    /**
    	Iterable for all the values.
    	*/
    def values(): IterableIterator[ValueType] = js.native
  }
}
