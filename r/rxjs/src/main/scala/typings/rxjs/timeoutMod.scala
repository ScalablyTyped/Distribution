package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeout", JSImport.Namespace)
@js.native
object timeoutMod extends js.Object {
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

