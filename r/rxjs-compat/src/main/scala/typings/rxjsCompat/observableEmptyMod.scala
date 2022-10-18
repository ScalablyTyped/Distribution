package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableEmptyMod {
  
  @JSImport("rxjs-compat/observable/empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  inline def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
