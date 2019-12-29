package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/first", JSImport.Namespace)
@js.native
object operatorsFirstMod extends js.Object {
  def first[T, D](): js.Any = js.native
  def first[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ]
  ): js.Any = js.native
  def first[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ],
    defaultValue: S
  ): js.Any = js.native
  def first[T, D](predicate: Null, defaultValue: D): js.Any = js.native
  @JSName("first")
  def first_TD[T, D](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ]
  ): js.Any = js.native
  @JSName("first")
  def first_TD[T, D](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ],
    defaultValue: D
  ): js.Any = js.native
}

