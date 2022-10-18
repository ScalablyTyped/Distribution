package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.Timestamp
import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsTimestampMod {
  
  @JSImport("rxjs/dist/types/internal/operators/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timestamp[T](): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp[T]]]
  inline def timestamp[T](timestampProvider: TimestampProvider): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(timestampProvider.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp[T]]]
}
