package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferCountMod {
  
  @JSImport("rxjs-compat/operator/bufferCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferCount[T](bufferSize: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def bufferCount[T](bufferSize: Double, startBufferEvery: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[Any]
}
