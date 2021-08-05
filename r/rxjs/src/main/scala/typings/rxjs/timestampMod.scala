package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timestampMod {
  
  @JSImport("rxjs/internal/operators/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/timestamp", "Timestamp")
  @js.native
  class Timestamp_[T] protected ()
    extends StObject
       with Timestamp[T] {
    def this(value: T, timestamp: Double) = this()
    
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /* CompleteClass */
    var value: T = js.native
  }
  
  inline def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
  inline def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
}
