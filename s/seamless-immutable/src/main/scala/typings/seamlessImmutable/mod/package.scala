package typings.seamlessImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typings.seamlessImmutable.seamlessImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (typings.seamlessImmutable.mod.Immutable.MakeImmutable[T, O]) | (js.Promise[typings.seamlessImmutable.mod.Immutable.MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = typings.seamlessImmutable.mod.ImmutableArray.Remaining[T] with typings.seamlessImmutable.mod.ImmutableArray.Additions[T] with typings.seamlessImmutable.mod.ImmutableArray.Overrides[T] with typings.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer[T]
  type ImmutableDate = typings.seamlessImmutable.mod.ImmutableDate_
  type ImmutableObject[T] = typings.seamlessImmutable.mod.ImmutableObjectMixin[T] with typings.seamlessImmutable.seamlessImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
