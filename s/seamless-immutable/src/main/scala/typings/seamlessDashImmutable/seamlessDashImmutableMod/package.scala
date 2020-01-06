package typings.seamlessDashImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seamlessDashImmutableMod {
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.Immutable.MakeImmutable
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Additions
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Overrides
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.ReadOnlyIndexer
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Remaining
  import typings.std.Exclude
  import typings.std.Pick

  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typings.seamlessDashImmutable.seamlessDashImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (MakeImmutable[T, O]) | (js.Promise[MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] with Additions[T] with Overrides[T] with ReadOnlyIndexer[T]
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  type ImmutableDate = typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDate.Remaining with typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDate.Additions
  type ImmutableObject[T] = ImmutableObjectMixin[T] with typings.seamlessDashImmutable.seamlessDashImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
