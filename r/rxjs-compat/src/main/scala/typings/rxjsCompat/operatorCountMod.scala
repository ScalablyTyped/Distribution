package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCountMod {
  
  @JSImport("rxjs-compat/operator/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Any]
  inline def count[T](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
      Boolean
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
}
