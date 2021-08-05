package typings.quickLru

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quick-lru", JSImport.Namespace)
  @js.native
  class ^[KeyType, ValueType] protected ()
    extends StObject
       with QuickLRU[KeyType, ValueType] {
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
  
  trait Options[KeyType, ValueType] extends StObject {
    
    /**
    		The maximum number of items before evicting the least recently used items.
    		*/
    val maxSize: Double
    
    /**
    		Called right before an item is evicted from the cache.
    		Useful for side effects or for items like object URLs that need explicit cleanup (`revokeObjectURL`).
    		*/
    var onEviction: js.UndefOr[js.Function2[/* key */ KeyType, /* value */ ValueType, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply[KeyType, ValueType](maxSize: Double): Options[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[KeyType, ValueType]]
    }
    
    extension [Self <: Options[?, ?], KeyType, ValueType](x: Self & (Options[KeyType, ValueType])) {
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setOnEviction(value: (/* key */ KeyType, /* value */ ValueType) => Unit): Self = StObject.set(x, "onEviction", js.Any.fromFunction2(value))
      
      inline def setOnEvictionUndefined: Self = StObject.set(x, "onEviction", js.undefined)
    }
  }
  
  @js.native
  trait QuickLRU[KeyType, ValueType]
    extends StObject
       with Iterable[js.Tuple2[KeyType, ValueType]] {
    
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
