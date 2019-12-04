package typings.reactDashCopyDashWrite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCopyDashWriteMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod._Global_.JSX.Element
  import typings.std.ReturnType

  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  type Consumer[T] = Component[ConsumerProps[T], js.Object, js.Any]
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, Unit]
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], Unit]
  type Provider[T] = Component[ProviderProps[T], js.Object, js.Any]
  type RenderFn[T] = js.Function1[/* repeated */ ReturnType[SelectorFn[T]], Element | js.Array[Element] | Null]
  type SelectorFn[T] = js.Function1[/* state */ T, AnyDeepMemberOfState[T]]
}
