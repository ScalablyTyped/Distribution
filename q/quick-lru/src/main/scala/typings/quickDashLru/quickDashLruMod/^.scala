package typings.quickDashLru.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quick-lru", JSImport.Namespace)
@js.native
class ^[KeyType /* <: js.Any */, ValueType /* <: js.Any */] protected () extends QuickLRU[KeyType, ValueType] {
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
  def this(options: Options) = this()
}

