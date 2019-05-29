package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New methods added by seamless-immutable. */
@js.native
trait Additions[T] extends js.Object {
  def asMutable(): js.Array[seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object]] = js.native
  def asMutable(
    opts: seamlessDashImmutableLib.seamlessDashImmutableMod.AsMutableOptions[
      scala.Boolean | seamlessDashImmutableLib.seamlessDashImmutableLibNumbers.`false` | seamlessDashImmutableLib.seamlessDashImmutableLibNumbers.`true`
    ]
  ): js.Array[seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object]] = js.native
  def asObject[U /* <: js.Object */, K /* <: java.lang.String */](
    toKeyValue: js.Function1[
      /* item */ T, 
      js.Tuple2[K, /* import warning: ImportType.apply Failed type conversion: U[K] */ js.Any]
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[U, js.Object] = js.native
  def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[TTarget] | TTarget, js.Object] = js.native
}

