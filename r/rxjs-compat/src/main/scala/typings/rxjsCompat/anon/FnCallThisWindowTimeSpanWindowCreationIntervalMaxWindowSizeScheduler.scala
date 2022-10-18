package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler extends StObject {
  
  def apply[T](windowTimeSpan: Double): Observable_[Observable_[T]] = js.native
  def apply[T](windowTimeSpan: Double, scheduler: SchedulerLike): Observable_[Observable_[T]] = js.native
  def apply[T](windowTimeSpan: Double, windowCreationInterval: Double): Observable_[Observable_[T]] = js.native
  def apply[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): Observable_[Observable_[T]] = js.native
  def apply[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): Observable_[Observable_[T]] = js.native
  def apply[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): Observable_[Observable_[T]] = js.native
}
