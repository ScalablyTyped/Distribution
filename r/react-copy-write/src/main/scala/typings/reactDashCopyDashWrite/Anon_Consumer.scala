package typings.reactDashCopyDashWrite

import org.scalablytyped.runtime.Instantiable0
import typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Consumer
import typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Mutator
import typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Provider
import typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.SelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Consumer[T]]
  var Provider: Instantiable0[typings.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Provider[T]]
  var createSelector: SelectorFn[T]
  var mutate: Mutator[T]
}

object Anon_Consumer {
  @scala.inline
  def apply[T /* <: js.Object */](
    Consumer: Instantiable0[Consumer[T]],
    Provider: Instantiable0[Provider[T]],
    createSelector: SelectorFn[T],
    mutate: Mutator[T]
  ): Anon_Consumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider, createSelector = createSelector, mutate = mutate)
  
    __obj.asInstanceOf[Anon_Consumer[T]]
  }
}

