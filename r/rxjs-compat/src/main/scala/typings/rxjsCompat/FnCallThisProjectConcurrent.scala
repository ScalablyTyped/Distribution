package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisProjectConcurrent extends js.Object {
  def apply[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ]
  ): js.Any = js.native
  def apply[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    concurrent: Double
  ): js.Any = js.native
}

