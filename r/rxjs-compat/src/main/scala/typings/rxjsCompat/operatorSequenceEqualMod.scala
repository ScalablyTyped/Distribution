package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSequenceEqualMod {
  
  @JSImport("rxjs-compat/operator/sequenceEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequenceEqual[T](
    compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def sequenceEqual[T](
    compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
    comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparor.asInstanceOf[js.Any])).asInstanceOf[Any]
}
