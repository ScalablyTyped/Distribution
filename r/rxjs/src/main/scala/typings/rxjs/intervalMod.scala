package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalMod {
  
  @JSImport("rxjs/internal/observable/interval", "interval")
  @js.native
  def interval(): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/interval", "interval")
  @js.native
  def interval(period: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/interval", "interval")
  @js.native
  def interval(period: Double): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/interval", "interval")
  @js.native
  def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}
