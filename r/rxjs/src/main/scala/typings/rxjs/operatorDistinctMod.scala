package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/operator/distinct", JSImport.Namespace)
@js.native
object operatorDistinctMod extends js.Object {
  def distinct[T, K](): js.Any = js.native
  def distinct[T, K](
    keySelector: js.UndefOr[scala.Nothing],
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
  def distinct[T, K](
    keySelector: js.Function1[/* value */ T, K],
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = js.native
}

