package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doMod {
  
  @JSImport("rxjs-compat/operator/do", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `do`[T](next: js.Function1[/* x */ T, Unit]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def `do`[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ Any, Unit],
    complete: js.Function0[Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def `do`[T](
    observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(observer.asInstanceOf[js.Any]).asInstanceOf[Any]
}
