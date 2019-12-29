package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/bufferToggle", JSImport.Namespace)
@js.native
object operatorBufferToggleMod extends js.Object {
  def bufferToggle[T, O](
    openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<O> */ js.Any,
    closingSelector: js.Function1[
      /* value */ O, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
    ]
  ): js.Any = js.native
}

