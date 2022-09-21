package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsCombineLatestMod {
  
  @JSImport("rxjs-compat/operators/combineLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatest[T, R](
    array: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def combineLatest[T, R](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any) | (js.Function1[/* repeated */ T, R]))*
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(project.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def combineLatest[T, T2](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def combineLatest[T, TOther, R](
    array: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ Any
    ],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4, T5](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4, T5, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4, T5, T6](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
    v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def combineLatest[T, T2, T3, T4, T5, T6, R](
    v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
    v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
    v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
    v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
}
