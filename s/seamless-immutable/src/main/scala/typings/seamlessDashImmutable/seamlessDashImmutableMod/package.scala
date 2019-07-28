package typings.seamlessDashImmutable

import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArrayNs.Additions
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArrayNs.Overrides
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArrayNs.ReadOnlyIndexer
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArrayNs.Remaining
import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableNs.MakeImmutable
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seamlessDashImmutableMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? object}
    */ typings.seamlessDashImmutable.seamlessDashImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (MakeImmutable[T, O]) | (js.Promise[MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] with Additions[T] with Overrides[T] with ReadOnlyIndexer[T]
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  type ImmutableDate = typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDateNs.Remaining with typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDateNs.Additions
  type ImmutableObject[T] = ImmutableObjectMixin[T] with typings.seamlessDashImmutable.seamlessDashImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
