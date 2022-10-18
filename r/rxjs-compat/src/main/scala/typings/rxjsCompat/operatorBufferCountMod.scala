package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferCountMod {
  
  @JSImport("rxjs-compat/operator/bufferCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferCount[T](bufferSize: Double): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferCount[T](bufferSize: Double, startBufferEvery: Double): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
}
