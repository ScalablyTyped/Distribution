package typings.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray

import typings.seamlessDashImmutable.seamlessDashImmutableMod.AsMutableOptions
import typings.seamlessDashImmutable.seamlessDashImmutableMod.Immutable
import typings.seamlessDashImmutable.seamlessDashImmutableNumbers.`false`
import typings.seamlessDashImmutable.seamlessDashImmutableNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New methods added by seamless-immutable. */
@js.native
trait Additions[T] extends js.Object {
  def asMutable(): js.Array[Immutable[T, js.Object]] = js.native
  def asMutable(opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = js.native
  @JSName("asMutable")
  def asMutable_false(opts: AsMutableOptions[`false`]): js.Array[Immutable[T, js.Object]] = js.native
  @JSName("asMutable")
  def asMutable_true(opts: AsMutableOptions[`true`]): js.Array[T] = js.native
  def asObject[U /* <: js.Object */, K /* <: String */](
    toKeyValue: js.Function1[
      /* item */ T, 
      js.Tuple2[
        K, 
        /* import warning: importer.ImportType#apply Failed type conversion: U[K] */ js.Any
      ]
    ]
  ): Immutable[U, js.Object] = js.native
  def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): Immutable[js.Array[TTarget] | TTarget, js.Object] = js.native
}

