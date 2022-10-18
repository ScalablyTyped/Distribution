package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.PartialObserver
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisNextErrorComplete extends StObject {
  
  def apply[T](next: js.Function1[/* x */ T, Unit]): Observable_[T] = js.native
  def apply[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Observable_[T] = js.native
  def apply[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ Any, Unit],
    complete: js.Function0[Unit]
  ): Observable_[T] = js.native
  def apply[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Observable_[T] = js.native
  def apply[T](observer: PartialObserver[T]): Observable_[T] = js.native
}
