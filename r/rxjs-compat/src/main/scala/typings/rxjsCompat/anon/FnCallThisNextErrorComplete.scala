package typings.rxjsCompat.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisNextErrorComplete extends StObject {
  
  def apply[T](next: js.Function1[/* x */ T, Unit]): Any = js.native
  def apply[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Any = js.native
  def apply[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ Any, Unit],
    complete: js.Function0[Unit]
  ): Any = js.native
  def apply[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Any = js.native
  def apply[T](
    observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ Any
  ): Any = js.native
}
