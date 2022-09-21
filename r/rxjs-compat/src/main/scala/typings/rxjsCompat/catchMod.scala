package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catchMod {
  
  @JSImport("rxjs-compat/operator/catch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `catch`[T, R](
    selector: js.Function2[
      /* err */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_catch")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
}
