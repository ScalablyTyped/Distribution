package typings.rxjsCompat

import typings.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTimeIntervalMod {
  
  @JSImport("rxjs-compat/operators/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  inline def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
}
