package typings
package reactDashCopyDashWriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Consumer[T]]
  var Provider: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Provider[T]]
  var createSelector: reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.SelectorFn[T]
  var mutate: reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Mutator[T]
}

object Anon_Consumer {
  @scala.inline
  def apply[T /* <: js.Object */](
    Consumer: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Consumer[T]],
    Provider: org.scalablytyped.runtime.Instantiable0[reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Provider[T]],
    createSelector: reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.SelectorFn[T],
    mutate: reactDashCopyDashWriteLib.reactDashCopyDashWriteMod.Mutator[T]
  ): Anon_Consumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider, createSelector = createSelector, mutate = mutate)
  
    __obj.asInstanceOf[Anon_Consumer[T]]
  }
}

