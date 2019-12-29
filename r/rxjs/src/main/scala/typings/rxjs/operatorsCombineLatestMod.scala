package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/combineLatest", JSImport.Namespace)
@js.native
object operatorsCombineLatestMod extends js.Object {
  def combineLatest[T, R](
    array: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
    ]
  ): js.Any = js.native
  def combineLatest[T, R](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | (js.Function1[/* repeated */ T, R]))*
  ): js.Any = js.native
  def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): js.Any = js.native
  def combineLatest[T, T2](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
  ): js.Any = js.native
  def combineLatest[T, TOther, R](
    array: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ _
    ],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): js.Any = js.native
  def combineLatest[T, T2, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
  ): js.Any = js.native
  def combineLatest[T, T2, T3](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
  ): js.Any = js.native
  def combineLatest[T, T2, T3, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4, T5](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4, T5, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4, T5, T6](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
    v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
  ): js.Any = js.native
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
    v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): js.Any = js.native
}

