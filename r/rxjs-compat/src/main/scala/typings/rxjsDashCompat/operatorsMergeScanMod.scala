package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/mergeScan", JSImport.Namespace)
@js.native
object operatorsMergeScanMod extends js.Object {
  def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R
  ): js.Any = js.native
  def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R,
    concurrent: Double
  ): js.Any = js.native
}

