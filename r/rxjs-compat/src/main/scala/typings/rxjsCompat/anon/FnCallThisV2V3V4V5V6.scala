package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisV2V3V4V5V6 extends StObject {
  
  def apply[T](): Observable_[T] = js.native
  def apply[T, R](array: js.Array[ObservableInput[Any]]): Observable_[T | R] = js.native
  def apply[T, R](observables: ObservableInput[Any]*): Observable_[T | R] = js.native
  def apply[T, R](v: ObservableInput[R]): Observable_[T | R] = js.native
  def apply[T, T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3 | R] = js.native
  def apply[T, T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4 | R] = js.native
  def apply[T, T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5 | R] = js.native
  def apply[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[T | T2 | T3 | T4 | T5 | T6 | R] = js.native
}
