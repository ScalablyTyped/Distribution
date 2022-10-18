package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableEmptyMod {
  
  @JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/observable/empty", "EMPTY")
  @js.native
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  inline def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  inline def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
