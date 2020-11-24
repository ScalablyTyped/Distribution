package typings.rxjs.timeIntervalMod

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/timeInterval", "timeInterval")
@js.native
object timeInterval extends js.Object {
  
  def apply[T](): OperatorFunction[T, TimeInterval_[T]] = js.native
  def apply[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = js.native
}
