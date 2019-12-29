package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/concatMap", JSImport.Namespace)
@js.native
object operatorsConcatMapMod extends js.Object {
  def concatMap[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ]
  ): js.Any = js.native
}

