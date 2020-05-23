package typings.reactCopyWrite.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reactCopyWrite.mod.AnyDeepMemberOfState
import typings.reactCopyWrite.mod.MutateFn
import typings.reactCopyWrite.mod.Mutator
import typings.reactCopyWrite.mod.Provider
import typings.reactCopyWrite.mod.SelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]]
  var Provider: Instantiable0[typings.reactCopyWrite.mod.Provider[T]]
  var createSelector: SelectorFn[T]
  var mutate: Mutator[T]
}

object Consumer {
  @scala.inline
  def apply[T](
    Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]],
    Provider: Instantiable0[Provider[T]],
    createSelector: T => AnyDeepMemberOfState[T],
    mutate: /* mutator */ MutateFn[T] => Unit
  ): Consumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
    __obj.asInstanceOf[Consumer[T]]
  }
}

