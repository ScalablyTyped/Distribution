package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableThrowErrorMod {
  
  @JSImport("rxjs/dist/types/internal/observable/throwError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throwError(errorFactory: js.Function0[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(errorOrErrorFactory: Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorOrErrorFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(error: Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
