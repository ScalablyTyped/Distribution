package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/delayWhen", JSImport.Namespace)
@js.native
object operatorDelayWhenMod extends js.Object {
  def delayWhen[T](
    delayDurationSelector: js.Function1[
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def delayWhen[T](
    delayDurationSelector: js.Function1[
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ],
    subscriptionDelay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = js.native
}

