package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throwErrorMod {
  
  @JSImport("rxjs/internal/observable/throwError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throwError(error: js.Any): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def throwError(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[scala.Nothing]]
}
