package typings.seamlessDashImmutable.seamlessDashImmutableMod

import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDate
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableNs {
  type AlreadyImmutable[O /* <: js.Object */] = ImmutableObject[O] | ImmutableArray[js.Any] | ImmutableDate
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type CannotMakeImmutable[O /* <: js.Object */] = AlreadyImmutable[O] | Primitive
  type MakeImmutable[T, O /* <: js.Object */] = ImmutableObject[T] | ImmutableDate | ImmutableArray[js.Any] | T
  type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | AnyFunction | Null]
}
