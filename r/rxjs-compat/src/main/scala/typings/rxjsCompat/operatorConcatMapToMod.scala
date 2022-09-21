package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorConcatMapToMod {
  
  @JSImport("rxjs-compat/operator/concatMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatMapTo[T, R](
    innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[Any]
}
