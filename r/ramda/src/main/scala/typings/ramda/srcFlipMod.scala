package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/flip", JSImport.Namespace)
@js.native
object srcFlipMod extends js.Object {
  def default[F /* <: js.Function1[/* args */ js.Any, _] */, P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.F.Parameters<F> */ js.Any */](fn: F): js.Any = js.native
  def default[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* arg1 */ U, TResult]): js.Function2[/* arg1 */ U, /* arg0 */ js.UndefOr[T], TResult] = js.native
}

