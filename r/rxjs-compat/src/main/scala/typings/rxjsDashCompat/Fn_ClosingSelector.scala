package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClosingSelector extends js.Object {
  def apply[T, O](
    openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
    closingSelector: js.Function1[
      /* openValue */ O, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
}

