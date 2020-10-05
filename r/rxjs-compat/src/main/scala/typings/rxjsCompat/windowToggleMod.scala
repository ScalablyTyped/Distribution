package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operators/windowToggle", JSImport.Namespace)
@js.native
object windowToggleMod extends js.Object {
  def windowToggle[T, O](
    openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
    closingSelector: js.Function1[
      /* openValue */ O, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
}

