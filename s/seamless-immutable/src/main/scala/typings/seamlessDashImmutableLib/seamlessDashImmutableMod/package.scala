package typings
package seamlessDashImmutableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seamlessDashImmutableMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? object}
    */ seamlessDashImmutableLib.seamlessDashImmutableLibStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableNs.MakeImmutable[T, O]) | (js.Promise[
    seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableNs.MakeImmutable[js.Any, O]
  ])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = stdLib.Readonly[
    seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs.Remaining[T] with seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs.Additions[T] with seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs.Overrides[T]
  ]
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  type ImmutableDate = seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableDateNs.Remaining with seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableDateNs.Additions
  type ImmutableObject[T] = ImmutableObjectMixin[T] with seamlessDashImmutableLib.seamlessDashImmutableLibStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
