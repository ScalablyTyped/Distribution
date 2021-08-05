package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferCountMod {
  
  @JSImport("rxjs/operator/bufferCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferCount[T](bufferSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def bufferCount[T](bufferSize: Double, startBufferEvery: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
