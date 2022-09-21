package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object letMod {
  
  @JSImport("rxjs-compat/operator/let", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def letProto[T, R](
    func: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("letProto")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
}
