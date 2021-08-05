package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferCountMod {
  
  @JSImport("rxjs/internal/operators/bufferCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  inline def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
}
