package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableNs {
  type AlreadyImmutable[O /* <: js.Object */] = seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableObject[O] | seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArray[js.Any] | seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableDate
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type CannotMakeImmutable[O /* <: js.Object */] = AlreadyImmutable[O] | Primitive
  type MakeImmutable[T, O /* <: js.Object */] = seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableObject[T] | seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableDate | seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArray[js.Any] | T
  type Primitive = js.UndefOr[
    scala.Boolean | scala.Double | java.lang.String | js.Symbol | AnyFunction | scala.Null
  ]
}
