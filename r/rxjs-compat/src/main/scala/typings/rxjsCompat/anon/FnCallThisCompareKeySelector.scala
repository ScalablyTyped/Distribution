package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisCompareKeySelector extends StObject {
  
  def apply[T](): Observable_[T] = js.native
  def apply[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): Observable_[T] = js.native
  def apply[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): Observable_[T] = js.native
}
