package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.Timestamp
import typings.rxjs.internalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timestampMod {
  
  @JSImport("rxjs/dist/types/internal/operators/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timestamp[T](): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp[T]]]
  inline def timestamp[T](timestampProvider: TimestampProvider): OperatorFunction[T, Timestamp[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(timestampProvider.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp[T]]]
}
