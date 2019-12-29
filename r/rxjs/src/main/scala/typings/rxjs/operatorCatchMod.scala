package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/catch", JSImport.Namespace)
@js.native
object operatorCatchMod extends js.Object {
  def _catch[T, R](
    selector: js.Function2[
      /* err */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ]
  ): js.Any = js.native
}

