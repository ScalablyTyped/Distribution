package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisV2V3V4V5V6Scheduler extends StObject {
  
  def apply[T](): Observable_[T] = js.native
  def apply[T](observables: (ObservableInput[T] | SchedulerLike)*): Observable_[T] = js.native
  def apply[T](scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T, T2](v2: ObservableInput[T2]): Observable_[T | T2] = js.native
  def apply[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): Observable_[T | T2] = js.native
  def apply[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3] = js.native
  def apply[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable_[T | T2 | T3] = js.native
  def apply[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = js.native
}
