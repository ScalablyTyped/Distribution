package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/zipAll", JSImport.Namespace)
@js.native
object operatorsZipAllMod extends js.Object {
  def zipAll[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ObservableInput<T>> */ js.Any
  ): js.Any = js.native
  def zipAll[R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any,
    project: js.Function1[/* repeated */ js.Any, R]
  ): js.Any = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
  ): js.Any = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ObservableInput<T>> */ js.Any,
    project: js.Function1[/* repeated */ T, R]
  ): js.Any = js.native
}

