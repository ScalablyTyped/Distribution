package typings.quickLru

import typings.quickLru.anon.MaxAge
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quick-lru", JSImport.Default)
  @js.native
  open class default[KeyType, ValueType] protected ()
    extends StObject
       with QuickLRU[KeyType, ValueType] {
    /**
    	Simple ["Least Recently Used" (LRU) cache](https://en.m.wikipedia.org/wiki/Cache_replacement_policies#Least_Recently_Used_.28LRU.29).
    	The instance is an [`Iterable`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Iteration_protocols) of `[key, value]` pairs so you can use it directly in a [`for…of`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Statements/for...of) loop.
    	@example
    	```
    	import QuickLRU from 'quick-lru';
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
    	The maximum number of milliseconds an item should remain in the cache.
    	@default Infinity
    	By default, `maxAge` will be `Infinity`, which means that items will never expire.
    	Lazy expiration upon the next write or read call.
    	Individual expiration of an item can be specified by the `set(key, value, maxAge)` method.
    	*/
    val maxAge: js.UndefOr[Double] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], KeyType, ValueType] (val x: Self & (Options[KeyType, ValueType])) extends AnyVal {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setOnEviction(value: (/* key */ KeyType, /* value */ ValueType) => Unit): Self = StObject.set(x, "onEviction", js.Any.fromFunction2(value))
      
      inline def setOnEvictionUndefined: Self = StObject.set(x, "onEviction", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Iterable because var conflicts: iterator. Inlined  */ @js.native
  trait QuickLRU[KeyType, ValueType]
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    
    /**
    	Iterable for all entries, starting with the oldest (ascending in recency).
    	*/
    def entriesAscending(): IterableIterator[js.Tuple2[KeyType, ValueType]] = js.native
    
    /**
    	Iterable for all entries, starting with the newest (descending in recency).
    	*/
    def entriesDescending(): IterableIterator[js.Tuple2[KeyType, ValueType]] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_QuickLRU: js.Function0[IterableIterator[js.Tuple2[KeyType, ValueType]]] = js.native
    
    /**
    	Get an item without marking it as recently used.
    	@returns The stored item or `undefined`.
    	*/
    def peek(key: KeyType): js.UndefOr[ValueType] = js.native
    
    /**
    	Update the `maxSize` in-place, discarding items as necessary. Insertion order is mostly preserved, though this is not a strong guarantee.
    	Useful for on-the-fly tuning of cache sizes in live systems.
    	*/
    def resize(maxSize: Double): Unit = js.native
    
    def set(key: KeyType, value: ValueType, options: MaxAge): this.type = js.native
  }
}
