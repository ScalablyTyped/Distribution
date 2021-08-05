package typings.restartHooks

import typings.std.Iterable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetMod {
  
  @JSImport("@restart/hooks/cjs/useSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create and return a [Set](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set) that triggers rerenders when it's updated.
    *
    * ```ts
    * const ids = useSet<number>([1,2,3,4]);
    *
    * return (
    *  <>
    *    {Array.from(ids, id => (
    *      <div>
    *        id: {id}. <button onClick={() => ids.delete(id)}>X</button>
    *      </div>
    *    )}
    *  </>
    * )
    * ```
    *
    * @param init initial Set values
    */
  inline def default[V](): ObservableSet[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ObservableSet[V]]
  inline def default[V](init: Iterable[V]): ObservableSet[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(init.asInstanceOf[js.Any]).asInstanceOf[ObservableSet[V]]
  
  @JSImport("@restart/hooks/cjs/useSet", "ObservableSet")
  @js.native
  class ObservableSet[V] protected ()
    extends StObject
       with Set[V] {
    def this(listener: js.Function1[/* map */ ObservableSet[V], Unit]) = this()
    def this(listener: js.Function1[/* map */ ObservableSet[V], Unit], init: Iterable[V]) = this()
    
    /* private */ val listener: js.Any = js.native
  }
}
