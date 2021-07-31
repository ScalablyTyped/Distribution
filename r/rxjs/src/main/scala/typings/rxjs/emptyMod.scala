package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod {
  
  @JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/observable/empty", "EMPTY")
  @js.native
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  @scala.inline
  def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  @scala.inline
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
