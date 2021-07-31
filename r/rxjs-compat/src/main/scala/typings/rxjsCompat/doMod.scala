package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doMod {
  
  @JSImport("rxjs-compat/operator/do", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def `do`[T](next: js.Function1[/* x */ T, Unit]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def `do`[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def `do`[T](
    observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
