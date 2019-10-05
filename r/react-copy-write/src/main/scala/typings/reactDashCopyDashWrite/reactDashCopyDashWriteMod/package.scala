package typings.reactDashCopyDashWrite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCopyDashWriteMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.Global.JSX.Element
  import typings.reactDashCopyDashWrite.AnyDeepMemberOfState
  import typings.std.ReturnType

  type Consumer[T] = Component[ConsumerProps[T], js.Object, js.Any]
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, Unit]
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], Unit]
  type Provider[T] = Component[ProviderProps[T], js.Object, js.Any]
  type RenderFn[T] = js.Function1[/* repeated */ ReturnType[SelectorFn[T]], Element | js.Array[Element] | Null]
  type SelectorFn[T] = js.Function1[/* state */ T, AnyDeepMemberOfState[T]]
}
