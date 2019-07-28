package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/startWith", JSImport.Namespace)
@js.native
object operatorStartWithMod extends js.Object {
  def startWith[T](`this`: Observable[T]): Observable[T] = js.native
  def startWith[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[T] = js.native
  def startWith[T, D](`this`: Observable[T], array: (D | SchedulerLike)*): Observable[T | D] = js.native
  def startWith[T, D](`this`: Observable[T], v1: D): Observable[T | D] = js.native
  def startWith[T, D](`this`: Observable[T], v1: D, scheduler: SchedulerLike): Observable[T | D] = js.native
  def startWith[T, D, E](`this`: Observable[T], v1: D, v2: E): Observable[T | D | E] = js.native
  def startWith[T, D, E](`this`: Observable[T], v1: D, v2: E, scheduler: SchedulerLike): Observable[T | D | E] = js.native
  def startWith[T, D, E, F](`this`: Observable[T], v1: D, v2: E, v3: F): Observable[T | D | E | F] = js.native
  def startWith[T, D, E, F](`this`: Observable[T], v1: D, v2: E, v3: F, scheduler: SchedulerLike): Observable[T | D | E | F] = js.native
  def startWith[T, D, E, F, G](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G): Observable[T | D | E | F | G] = js.native
  def startWith[T, D, E, F, G](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): Observable[T | D | E | F | G] = js.native
  def startWith[T, D, E, F, G, H](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G, v5: H): Observable[T | D | E | F | G | H] = js.native
  def startWith[T, D, E, F, G, H](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): Observable[T | D | E | F | G | H] = js.native
  def startWith[T, D, E, F, G, H, I](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): Observable[T | D | E | F | G | H | I] = js.native
  def startWith[T, D, E, F, G, H, I](`this`: Observable[T], v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): Observable[T | D | E | F | G | H | I] = js.native
}

