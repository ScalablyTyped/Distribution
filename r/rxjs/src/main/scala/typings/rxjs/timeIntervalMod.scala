package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeIntervalMod {
  
  @JSImport("rxjs/internal/operators/timeInterval", "TimeInterval")
  @js.native
  class TimeInterval_[T] protected () extends StObject {
    def this(value: T, interval: Double) = this()
    
    var interval: Double = js.native
    
    var value: T = js.native
  }
  
  @JSImport("rxjs/internal/operators/timeInterval", "timeInterval")
  @js.native
  def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = js.native
  @JSImport("rxjs/internal/operators/timeInterval", "timeInterval")
  @js.native
  def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = js.native
}
