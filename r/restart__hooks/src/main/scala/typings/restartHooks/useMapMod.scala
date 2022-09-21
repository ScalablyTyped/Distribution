package typings.restartHooks

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMapMod {
  
  @JSImport("@restart/hooks/cjs/useMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def default[K, V](): ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ObservableMap[K, V]]
  inline def default[K, V](init: js.Iterable[js.Tuple2[K, V]]): ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(init.asInstanceOf[js.Any]).asInstanceOf[ObservableMap[K, V]]
  
  @JSImport("@restart/hooks/cjs/useMap", "ObservableMap")
  @js.native
  open class ObservableMap[K, V] protected ()
    extends StObject
       with Map[K, V] {
    def this(listener: js.Function1[/* map */ ObservableMap[K, V], Unit]) = this()
    def this(listener: js.Function1[/* map */ ObservableMap[K, V], Unit], init: js.Iterable[js.Tuple2[K, V]]) = this()
    
    /* private */ val listener: Any = js.native
  }
}
