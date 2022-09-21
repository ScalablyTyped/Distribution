package typings.rxjs.anon

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.timeoutMod.TimeoutInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait With[T, M, O /* <: ObservableInput[Any] */] extends StObject {
  
  def `with`(info: TimeoutInfo[T, M]): O
}
object With {
  
  inline def apply[T, M, O /* <: ObservableInput[Any] */](`with`: TimeoutInfo[T, M] => O): With[T, M, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[With[T, M, O]]
  }
  
  extension [Self <: With[?, ?, ?], T, M, O /* <: ObservableInput[Any] */](x: Self & (With[T, M, O])) {
    
    inline def setWith(value: TimeoutInfo[T, M] => O): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
  }
}
