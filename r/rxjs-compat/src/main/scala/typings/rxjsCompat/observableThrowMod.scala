package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableThrowMod {
  
  @JSImport("rxjs-compat/observable/throw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `throw`(errorFactory: js.Function0[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("_throw")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def `throw`(errorOrErrorFactory: Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_throw")(errorOrErrorFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
  inline def `throw`(error: Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("_throw")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
