package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "range")
@js.native
object range extends js.Object {
  def apply(): Observable[Double] = js.native
  def apply(start: js.UndefOr[scala.Nothing], count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(start: js.UndefOr[scala.Nothing], count: Double): Observable[Double] = js.native
  def apply(start: js.UndefOr[scala.Nothing], count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(start: Double): Observable[Double] = js.native
  def apply(start: Double, count: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(start: Double, count: Double): Observable[Double] = js.native
  def apply(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

