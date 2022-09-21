package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRaceMod {
  
  @JSImport("rxjs-compat/operator/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def race[T](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
    ]))*
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def race[T](
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def race_TR[T, R](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
    ]))*
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def race_TR[T, R](
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Any]
}
