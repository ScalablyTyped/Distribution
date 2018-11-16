package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SeamlessImmutableNs {
  type BaseImmutable[T] = ImmutableObjectMixin[T] | ImmutableArrayMixin[T]
  type DeepPartial[T] = seamlessDashImmutableLib.seamlessDashImmutableLibStrings.DeepPartial with js.Any
  type Immutable[T] = seamlessDashImmutableLib.seamlessDashImmutableLibStrings.Immutable with T with BaseImmutable[T]
}
