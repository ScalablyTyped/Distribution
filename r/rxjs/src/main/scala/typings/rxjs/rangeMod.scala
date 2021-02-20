package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("rxjs/internal/observable/range", "dispatch")
  @js.native
  def dispatch(state: js.Any): Unit = js.native
  
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: Double): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: js.UndefOr[scala.Nothing], count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: Double): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: Double, count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: Double, count: Double): Observable[Double] = js.native
  @JSImport("rxjs/internal/observable/range", "range")
  @js.native
  def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}
