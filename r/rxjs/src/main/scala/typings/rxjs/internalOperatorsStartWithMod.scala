package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/startWith", JSImport.Namespace)
@js.native
object internalOperatorsStartWithMod extends js.Object {
  def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = js.native
  def startWith[T, D](v1: D): OperatorFunction[T, T | D] = js.native
  def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = js.native
  def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = js.native
  def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = js.native
  def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = js.native
  def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = js.native
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = js.native
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = js.native
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = js.native
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = js.native
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
}

