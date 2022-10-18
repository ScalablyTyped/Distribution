package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDurationSchedulerConfig extends StObject {
  
  def apply[T](duration: Double): Observable_[T] = js.native
  def apply[T](
    duration: Double,
    scheduler: Unit,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = js.native
  def apply[T](duration: Double, scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](
    duration: Double,
    scheduler: SchedulerLike,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = js.native
}
