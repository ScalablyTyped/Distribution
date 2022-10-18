package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsTimeIntervalMod {
  
  @JSImport("rxjs/dist/types/internal/operators/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/operators/timeInterval", "TimeInterval")
  @js.native
  open class TimeInterval_[T] protected () extends StObject {
    /**
      * @deprecated Internal implementation detail, do not construct directly. Will be made an interface in v8.
      */
    def this(value: T, interval: Double) = this()
    
    var interval: Double = js.native
    
    var value: T = js.native
  }
  
  inline def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  inline def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
}
