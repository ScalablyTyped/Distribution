package typings.restartHooks

import typings.std.Iterable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetMod {
  
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
  @JSImport("@restart/hooks/cjs/useSet", JSImport.Default)
  @js.native
  def default[V](): ObservableSet[V] = js.native
  @JSImport("@restart/hooks/cjs/useSet", JSImport.Default)
  @js.native
  def default[V](init: Iterable[V]): ObservableSet[V] = js.native
  
  @JSImport("@restart/hooks/cjs/useSet", "ObservableSet")
  @js.native
  class ObservableSet[V] protected () extends Set[V] {
    def this(listener: js.Function1[/* map */ ObservableSet[V], Unit]) = this()
    def this(listener: js.Function1[/* map */ ObservableSet[V], Unit], init: Iterable[V]) = this()
    
    val listener: js.Any = js.native
  }
}
