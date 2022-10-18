package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisKeySelectorFlushes extends StObject {
  
  def apply[T, K](): Observable_[T] = js.native
  def apply[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[T] = js.native
  def apply[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable_[Any]): Observable_[T] = js.native
  def apply[T, K](keySelector: Unit, flushes: Observable_[Any]): Observable_[T] = js.native
}
