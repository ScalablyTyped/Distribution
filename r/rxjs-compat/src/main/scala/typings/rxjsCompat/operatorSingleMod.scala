package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSingleMod {
  
  @JSImport("rxjs-compat/operator/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def single[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[Any]
  inline def single[T](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
      Boolean
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
}
