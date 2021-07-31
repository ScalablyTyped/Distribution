package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeIntervalMod {
  
  @JSImport("rxjs/internal/operators/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/timeInterval", "TimeInterval")
  @js.native
  class TimeInterval_[T] protected () extends StObject {
    def this(value: T, interval: Double) = this()
    
    var interval: Double = js.native
    
    var value: T = js.native
  }
  
  @scala.inline
  def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  @scala.inline
  def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
}
