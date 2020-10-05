package typings.rxjsCompat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisKeySelectorFlushes extends js.Object {
  def apply[T, K](): js.Any = js.native
  def apply[T, K](
    keySelector: js.UndefOr[scala.Nothing],
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = js.native
  def apply[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
  def apply[T, K](
    keySelector: js.Function1[/* value */ T, K],
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = js.native
}

