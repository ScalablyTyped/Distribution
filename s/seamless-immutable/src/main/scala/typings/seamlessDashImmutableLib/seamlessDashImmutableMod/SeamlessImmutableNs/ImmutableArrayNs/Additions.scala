package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs.ImmutableArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New methods added by seamless-immutable. */
@js.native
trait Additions[T] extends js.Object {
  def asMutable(): js.Array[T] = js.native
  def asMutable(opts: seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs.AsMutableOptions): js.Array[T] = js.native
  def asObject[U /* <: js.Object */, K /* <: java.lang.String */](
    toKeyValue: js.Function1[
      /* item */ T, 
      js.Tuple2[K, /* import warning: ImportType.apply Failed type conversion: U[K] */ js.Any]
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs.Immutable[U, js.Object] = js.native
  def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs.Immutable[js.Array[TTarget] | TTarget, js.Object] = js.native
}

