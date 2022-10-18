package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisPeriodScheduler extends StObject {
  
  def apply[T](period: Double): Observable_[T] = js.native
  def apply[T](period: Double, scheduler: SchedulerLike): Observable_[T] = js.native
}
