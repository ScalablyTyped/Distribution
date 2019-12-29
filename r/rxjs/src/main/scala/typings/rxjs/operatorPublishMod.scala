package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/publish", JSImport.Namespace)
@js.native
object operatorPublishMod extends js.Object {
  def publish[T](): js.Any = js.native
  def publish[T](
    selector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
    ]
  ): js.Any = js.native
  @JSName("publish")
  def publish_TR[T, R](
    selector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
    ]
  ): js.Any = js.native
}

