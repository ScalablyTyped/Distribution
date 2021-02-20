package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod {
  
  @JSImport("rxjs/internal/observable/empty", "EMPTY")
  @js.native
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  @JSImport("rxjs/internal/observable/empty", "empty")
  @js.native
  def empty(): Observable[scala.Nothing] = js.native
  @JSImport("rxjs/internal/observable/empty", "empty")
  @js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}
