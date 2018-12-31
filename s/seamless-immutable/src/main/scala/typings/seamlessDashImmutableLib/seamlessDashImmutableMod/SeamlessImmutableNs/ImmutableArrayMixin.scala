package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableArrayMixin[T /* <: js.Array[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any] */] extends js.Object {
  def asMutable(): T = js.native
  def asMutable(opts: AsMutableOptions): T = js.native
  def asObject(
    toKeyValue: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[0] */ /* item */ js.Any, 
      js.Tuple2[java.lang.String, _]
    ]
  ): Immutable[js.Object] = js.native
  def flatMap[TTarget](
    mapFunction: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[0] */ /* item */ js.Any, 
      TTarget
    ]
  ): Immutable[js.Array[TTarget] | TTarget] = js.native
}

