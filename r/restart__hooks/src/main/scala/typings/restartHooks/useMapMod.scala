package typings.restartHooks

import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useMap", JSImport.Namespace)
@js.native
object useMapMod extends js.Object {
  
  /**
    * Create and return a [Map](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map) that triggers rerenders when it's updated.
    *
    * ```tsx
    * const customerAges = useMap<number>([
    *  ['john', 24],
    *  ['betsy', 25]
    * ]);
    *
    * return (
    *  <>
    *    {Array.from(ids, ([name, age]) => (
    *      <div>
    *        {name}: {age}. <button onClick={() => ids.delete(name)}>X</button>
    *      </div>
    *    )}
    *  </>
    * )
    * ```
    *
    * @param init initial Map entries
    */
  def default[K, V](): ObservableMap[K, V] = js.native
  def default[K, V](init: Iterable[js.Tuple2[K, V]]): ObservableMap[K, V] = js.native
  
  @js.native
  class ObservableMap[K, V] protected () extends Map[K, V] {
    def this(listener: js.Function1[/* map */ ObservableMap[K, V], Unit]) = this()
    def this(listener: js.Function1[/* map */ ObservableMap[K, V], Unit], init: Iterable[js.Tuple2[K, V]]) = this()
    
    val listener: js.Any = js.native
  }
}
