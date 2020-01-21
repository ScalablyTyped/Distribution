package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnAcc extends js.Object {
  def apply[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R
  ): js.Any = js.native
  def apply[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R,
    concurrent: Double
  ): js.Any = js.native
}

