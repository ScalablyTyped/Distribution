package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowToggle", JSImport.Namespace)
@js.native
object operatorWindowToggleMod extends js.Object {
  def windowToggle[T, O](
    openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
    closingSelector: js.Function1[
      /* openValue */ O, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
}

