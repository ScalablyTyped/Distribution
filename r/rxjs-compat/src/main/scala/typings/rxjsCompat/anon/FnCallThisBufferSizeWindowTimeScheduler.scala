package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisBufferSizeWindowTimeScheduler extends StObject {
  
  def apply[T](): Observable_[T] = js.native
  def apply[T](bufferSize: Double): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ Any
  ): Observable_[T] = js.native
}
