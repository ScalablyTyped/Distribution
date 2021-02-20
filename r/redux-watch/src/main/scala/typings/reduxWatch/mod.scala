package typings.reduxWatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param getState Function, that returns the Redux store state.
    * @param pathToField Most commonly dot separated string, or array of strings
    *      and numbers that form path to a field of the state object. For details
    *      refer @link https://github.com/mariocasciaro/object-path
    * @param compare Optional field comparison function. Defaults to strict
    *      equality check (===).
    * @returns Function, that listens to changes of the given field of the Redux store
    *      state. On change it calls its parameter, which is a change handler function.
    */
  @JSImport("redux-watch", JSImport.Namespace)
  @js.native
  def apply(getState: js.Function0[_]): ChangeHandlerWrapper[_] = js.native
  @JSImport("redux-watch", JSImport.Namespace)
  @js.native
  def apply(
    getState: js.Function0[_],
    pathToField: js.UndefOr[FieldPath],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): ChangeHandlerWrapper[_] = js.native
  @JSImport("redux-watch", JSImport.Namespace)
  @js.native
  def apply(getState: js.Function0[_], pathToField: FieldPath): ChangeHandlerWrapper[_] = js.native
  
  /** Whenever a given state field changes this handler will be called. */
  type ChangeHandler[T] = js.Function3[/* newValue */ T, /* oldValue */ T, /* pathToField */ FieldPath, Unit]
  
  /**
    * @returns Function, that wraps the given change handler in. It should be
    * subscribed to state changes using store.subscribe(). Afterwards, it
    * calls change handler whenever the watched state field changes.
    */
  type ChangeHandlerWrapper[T] = js.Function1[/* changeHandler */ ChangeHandler[T], FieldWatch]
  
  type FieldPath = String | Double | (js.Array[String | Double])
  
  /** @see ChangeHandlerWrapper */
  type FieldWatch = js.Function0[Unit]
}
