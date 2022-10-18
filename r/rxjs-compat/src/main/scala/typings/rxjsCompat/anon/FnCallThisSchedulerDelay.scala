package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisSchedulerDelay extends StObject {
  
  def apply[T](scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](scheduler: SchedulerLike, delay: Double): Observable_[T] = js.native
}
