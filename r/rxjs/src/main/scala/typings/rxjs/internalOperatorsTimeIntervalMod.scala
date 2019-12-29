package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeInterval", JSImport.Namespace)
@js.native
object internalOperatorsTimeIntervalMod extends js.Object {
  @js.native
  class TimeInterval[T] protected () extends js.Object {
    def this(value: T, interval: Double) = this()
    var interval: Double = js.native
    var value: T = js.native
  }
  
  def timeInterval[T](): OperatorFunction[T, TimeInterval[T]] = js.native
  def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval[T]] = js.native
}

