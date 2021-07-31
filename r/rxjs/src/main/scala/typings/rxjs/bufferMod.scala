package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("rxjs/internal/operators/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buffer[T](closingNotifier: Observable[js.Any]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(closingNotifier.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
}
