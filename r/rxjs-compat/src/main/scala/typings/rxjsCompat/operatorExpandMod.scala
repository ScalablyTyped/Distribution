package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operator/expand", JSImport.Namespace)
@js.native
object operatorExpandMod extends js.Object {
  def expand[T](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
    ]
  ): js.Any = js.native
  def expand[T](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
    ],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def expand[T](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
    ],
    concurrent: Double
  ): js.Any = js.native
  def expand[T](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
    ],
    concurrent: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  @JSName("expand")
  def expand_TR[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ]
  ): js.Any = js.native
  @JSName("expand")
  def expand_TR[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  @JSName("expand")
  def expand_TR[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    concurrent: Double
  ): js.Any = js.native
  @JSName("expand")
  def expand_TR[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    concurrent: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

