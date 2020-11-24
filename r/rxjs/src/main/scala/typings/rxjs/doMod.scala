package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/operator/do", JSImport.Namespace)
@js.native
object doMod extends js.Object {
  
  @JSName("_do")
  def `do`[T](next: js.Function1[/* x */ T, Unit]): js.Any = js.native
  @JSName("_do")
  def `do`[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): js.Any = js.native
  @JSName("_do")
  def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
  @JSName("_do")
  def `do`[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = js.native
  @JSName("_do")
  def `do`[T](
    observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
  ): js.Any = js.native
}
