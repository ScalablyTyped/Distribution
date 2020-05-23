package typings.rxjsCompat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisPredicateDefaultValue extends js.Object {
  def apply[T, D](): js.Any = js.native
  def apply[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ]
  ): js.Any = js.native
  def apply[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ],
    defaultValue: S
  ): js.Any = js.native
  def apply[T, D](predicate: Null, defaultValue: D): js.Any = js.native
}

